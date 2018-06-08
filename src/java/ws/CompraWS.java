/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import mybatis.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import pojos.Pedido;
import pojos.Producto;

/**
 *
 * @author alex
 */
@Path("compra")
public class CompraWS {
    @Context
    private UriInfo context;
    
    public CompraWS(){
    }
    
    @Path("/listPedidos")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Pedido> getPedidos(){
        List<Pedido> list = null;
        SqlSession conn = MyBatisUtil.getSession();
        try {
            list = conn.selectList("Pedido.getAllPedido");
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            conn.close();
        }
        return list;
    }
    
    @Path("/listProductos")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Producto> getProductos(){
        List<Producto> list = null;
        SqlSession conn = MyBatisUtil.getSession();
        try {
            list = conn.selectList("Producto.getAllProducto");
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            conn.close();
        }
        return list;
    }
    
    @Path("/createPedido")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Pedido> createPedido(Pedido pedido){
        SqlSession conn = MyBatisUtil.getSession();
        conn.insert("Pedido.createPedido", pedido );
        System.out.println("record inserted successfully");
        conn.commit();
        List<Pedido> list = null;
        
        try {
            list = conn.selectList("Pedido.getAllPedido");
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            conn.close();
        }
        return list;
    }
}
