package action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import dao.GuitarSearchDao;
import dao.GuitarSearchDaoImpl;
import entity.Guitar;
import entity.GuitarSpec;
import entity.Inventory;
import entity.Type;
import entity.Builder;
import entity.Wood;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import service.GuitarSearchService;
import service.impl.GuitarSearchServiceImpl;

public class GuitarAction extends ActionSupport{
	private Builder builder; 
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	//	
	public String search() throws IOException{
		out();
		GuitarSearchDao guitarDao=new GuitarSearchDaoImpl();
		GuitarSearchService guitarSearchService=new GuitarSearchServiceImpl();		
		guitarSearchService.setGuitarSearchDao(guitarDao);
		Inventory inventory=new Inventory(guitarSearchService.getAllGuitars());
		GuitarSpec whatyoulike=new GuitarSpec(builder,model,type,backWood,topWood);
		List<Guitar> macthingGuitars=inventory.search(whatyoulike);
		
		JSONArray array=new JSONArray();
		for(Guitar guitar:macthingGuitars){
			 JSONObject jo=new JSONObject();
			 jo.put("serialNumber",guitar.getSerialNumber());
			 jo.put("price",guitar.getPrice());
			 jo.put("builder",guitar.getSpec().getBuilder());
			 jo.put("model",guitar.getSpec().getModel());
			 jo.put("type",guitar.getSpec().getType());
			 jo.put("backWood",guitar.getSpec().getBackWood());
			 jo.put("topWood",guitar.getSpec().getTopWood());
			 array.add(jo);
		}
		out().print(array);
		out().flush(); 
		out().close();
		return SUCCESS;
	}
	public PrintWriter out()throws IOException{
		HttpServletResponse response=ServletActionContext.getResponse();  
        response.setContentType("text/html");  
        response.setContentType("text/plain; charset=utf-8");
        PrintWriter out= response.getWriter();
        return out;
	}
	public Builder getBuilder() {
		return builder;
	}
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Wood getBackWood() {
		return backWood;
	}
	public void setBackWood(Wood backWood) {
		this.backWood = backWood;
	}
	public Wood getTopWood() {
		return topWood;
	}
	public void setTopWood(Wood topWood) {
		this.topWood = topWood;
	}
}
