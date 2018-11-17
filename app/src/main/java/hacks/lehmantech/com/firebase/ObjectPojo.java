package hacks.lehmantech.com.firebase;

import java.util.List;

public class ObjectPojo {
    public String str_obj;
    public String id;
    public String date;
    public ObjectPojo(){}

    public ObjectPojo(String id,String info, String date){

        this.id  = id;
        this.date  = date;
        //we will make this app smart and we can also help the algorithm so that we can know more inputs
        if(info.equals("face")){
            this.str_obj =  "person";
        }else{
            this.str_obj =  info;
        }

    }

    public void setDate(String d)
    {this.date  =  d;}
    public void setStr_obj(String s)
    {this.str_obj = s;}
    public void setId(String id)
    {this.id =  id;}

    public String getStr_obj()
    {return  this.str_obj;}
    public String getId()
    {return this.id;}
    public String getDate()
    {return this.date;}
}
