package com.diaz.malambo.object;

import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.Node;

public class Derivar {
	
	
	public Derivar(){
		
		
	}
	
	public String hallar_derivada(String derivada){
		String deriva="";
		
		DJep proceso=new DJep();
		
		proceso.addStandardFunctions();
		proceso.addStandardConstants();
		proceso.addComplex();
		proceso.setAllowUndeclared(true);
		proceso.setAllowAssignment(true);
		proceso.setImplicitMul(true);
		proceso.addStandardDiffRules();
		
		try{
			
			Node node=proceso.parse(derivada);
			proceso.println(node);
			Node diff=proceso.differentiate(node, "x");
			Node sim=proceso.simplify(diff);
			deriva=proceso.toString(sim);
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
		return deriva;
	}
	
	public String calcular(String variable){
		if(variable.contains("cos")){
			
			String[] var=variable.split("cos");
			String reemplace=var[1].replace("(", "").replace(")", "");
			
			
			if(reemplace.equals("x")){
				
				for(int i=0;i<5;i++){
					if(var[0] !=""){
						if(var[0].equals("x")){
							for(int j=0;j<5;j++){
								double cos=Math.cos(i)+i;
								System.out.println(cos);
								return cos+"";
								
							}
						
						}else{
							if(var[0].contains("+")){
								String r=var[0].replace("+", "");
								
								double cos=Math.cos(i)+Double.parseDouble(r);
								System.out.println(cos);
								return cos+"";
							}
							if(var[0].contains("-")){
								String r=var[0].replace("-", "");
								double cos=Math.cos(i)-Double.parseDouble(r);
								System.out.println(cos);
								return cos+"";
							}
							if(var[0].contains("*")){
								
								String r=var[0].replace("*", "");
								double cos=Math.cos(i)*Double.parseDouble(r);
								System.out.println(cos);
								return cos+"";
							}
							if(var[0].contains("/")){
								String r=var[0].replace("/", "");
								double cos=Math.cos(i)/Double.parseDouble(r);
								System.out.println(cos);
								return cos+"";
								
							}else{
								return "no hay";
							}
						}
						
					}else{
						double cos=Math.cos(i);
						System.out.println(cos);
						return cos+"";
					}
					
					
				}
			}else{
				return "no hay";
			}
		}
		return "no hay";
		
	}

}