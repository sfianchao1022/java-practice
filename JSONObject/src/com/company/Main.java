package com.company;

import org.json.JSONObject;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void createJson(){

        JSONObject obj=new JSONObject();
        //obj.put("index",1);
        obj.put("name", "John");
        obj.put("sex", "male");
        obj.put("age", 22);
        obj.put("is_student", true);
        obj.put("hobbies", new String[] {"hiking", "swimming"});
        //呼叫toString()方法可直接將其內容列印出來
        System.out.println(obj.toString());

    }

    public static void createJsonHashMap(){

        HashMap hashMap=new HashMap();
        HashMap<String,Integer> map=new HashMap<String,Integer>();//自訂key,value型態
        hashMap.put("name", "John");
        hashMap.put("sex", "male");
        hashMap.put("age", 22);
        hashMap.put("is_student", true);
        hashMap.put("hobbies", new String[] {"hiking", "swimming"});
        map.put("age", 22);
        map.put("height", 180);
        map.put("weight", 60);
        JSONObject obj=new JSONObject(hashMap);
        JSONObject o=new JSONObject(map);

        if(obj.getBoolean("is_student")){
            System.out.println("is Student");
        }

        //呼叫toString()方法可直接將其內容列印出來，也可直接print obj
        System.out.println(obj.toString());
        System.out.println(o);
    }

    public static void createJsonByJavaBean(){
        //java bean => 特定功能且可以重複使用的副程式
        PersonInfo info = new PersonInfo();
        info.setName("John");
        info.setSex("male");
        info.setAge(22);
        info.setStudent(true);
        info.setHobbies(new String[] {"hiking", "swimming"});
        JSONObject obj = new JSONObject(info);
        System.out.println(obj);
        System.out.println(obj.getString("name"));
        System.out.println(obj.getInt("age"));

        //JSONObject can not get java bean boolean
//        if(obj.getBoolean("isStudent")){
//            System.out.println("is Student");
//        }
    }

    public static void createJsonFile(){

    }

    public static void main(String[] args) throws IOException{
	// write your code here
        createJson();
        createJsonHashMap();
        createJsonByJavaBean();

        //demo.json and Main.class在同一個資料夾(src/com/company)相對路徑
        //File file = new File("src/com/company/demo.json");

        //通过字节码对象读取json file
        String path = Main.class.getResource("demo.json").getPath();
        File file = new File(path);

        try{
            if(file.exists()){
                System.out.println("works!");
            }

        }catch(Exception e){
            e.getMessage();
        }

        String content = FileUtils.readFileToString(file,Charset.defaultCharset());
        JSONObject obj=new JSONObject(content);
        System.out.println(obj.get("name"));

        String letterPath=Main.class.getResource("letter.json").getPath();
        File letterFile=new File(letterPath);
        String letterContent=FileUtils.readFileToString(letterFile,Charset.defaultCharset());
        JSONObject phoneObj=new JSONObject(letterContent);
        //System.out.println(phoneObj.get("2"));

        letterCombination("23");
        //permutation();
    }

    public static void permutation(String[] s,int pos){

        //String[] number={"2","3"};
        String[] letter1={"a","b"};
        String[] letter2={"c","d"};
        String combination="";
        ArrayList<String> ans=new ArrayList<>();
        for(int i=pos;i<2;i++){
            combination=combination+s[i];
            //permutation(new String[]{"c","d"},pos++);

                permutation(new String[]{"c","d"},pos++);



            System.out.println(combination);
        }
    }

    public static void letterCombination(String digits) {
        List<String> list = new ArrayList<String>();

        //String num=digits;
        String[] numArray=digits.split("");

        permutation(new String[]{"a","b"},0);

//        String[] num=null;
//
//        for(String temp : num){
//            list.add(temp);
//        }


        list.add(numArray[0]);

        try{
            System.out.println(list);
        }catch(Exception e){
            e.getMessage();
        }

    }

}
