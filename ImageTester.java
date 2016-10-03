import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import javax.imageio.ImageIO;
import javax.swing.ListModel;
public class ImageTester {
	public static void main(String[] args) {
		ColorUtils objColorUtils=new ColorUtils();
		 File file = new File("F:\\Shreyas\\MS Study\\CS537\\Framework-Example\\images\\rockswj13_rel.jpg");
		HashSet colors= getImageColor(file);
		//System.out.println(colors);
		HashMap hm=new HashMap();
		Iterator itr = colors.iterator();
		String Minfo="";
		System.out.println(hm.size());
		while(itr.hasNext()){
			Color colorobj=(Color)itr.next();
			Minfo=objColorUtils.getColorNameFromRgb(colorobj.getRed(), colorobj.getGreen(), colorobj.getBlue());
			//System.out.println(Minfo);
			Integer count=0;
			String Mineral=Minfo.split(":")[1];
			//System.out.println(Mineral);
			if(hm.containsKey(Mineral))
			{
				count=(Integer)hm.get(Mineral);
				hm.put(Mineral,count+1);
			}
			else
			{
			hm.put(Mineral,1);
			}
		  }
		
		try {
			FileWriter jfile = new FileWriter("Minerals.json");
			ArrayList<mineral> listMinerals=new ArrayList<mineral>();
			JSONArray list = new JSONArray();
		JSONObject obj = new JSONObject();
		Iterator it = hm.entrySet().iterator();
	    while (it.hasNext()) {
	    	mineral objMineral=new mineral(); 
	        Map.Entry pair = (Map.Entry)it.next();
	        objMineral.setName(pair.getKey().toString());
	        objMineral.setCount(Integer.parseInt(pair.getValue().toString()));
	        //System.out.println(objMineral.getName());
	        //System.out.println(objMineral.getCount());
	        //listMinerals.add(objMineral);
	        
	        
	    }
	   obj.put("Mineral", list);
	    String jsonString = JSONValue.toJSONString(listMinerals);
	    jfile.write(obj.toJSONString());
			jfile.flush();
			jfile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(hm);
		   
	}
		    
	    public static HashSet getImageColor(File imagePath) {
	        int color=0;
	        int count=0;
	        HashSet hs=new HashSet();
			try {
				
				BufferedImage image = ImageIO.read(imagePath);
					color = image.getRGB(0, 0);
					for (int r = 0; r < image.getHeight(); r += 1) {
					    for (int c = 0; c < image.getWidth(); c += 1) {
					    	hs.add(new Color(image.getRGB(c, r)));
					    	count++;
					       
					        }
					    }
//				    System.out.println(count);
//					System.out.println(hs.size());
//					System.out.println(hs);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
	        return hs;
	    }

	   
	    
	    
}
