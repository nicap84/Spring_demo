package com.annotaionsspring;

import org.springframework.stereotype.Component;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FileFortuneService implements NewFortuneService{

    private Random random = new Random();
    private List<String> readFileFortune () {
        List<String> myList = new ArrayList<String>(); //constructs a string list
        try
        {
            File file = new File("/Users/maria/Proyectos/SpringProjects/src/main/java/com/annotaionsspring/fortune.txt");    //creates a new file instance
            FileReader fr = new FileReader(file);   //reads the file
            BufferedReader br = new BufferedReader(fr);  //creates a buffering character input stream
            String line;
            while((line=br.readLine())!=null)
            {
                myList.add(line);
            }
            fr.close();    //closes the stream and release the resources
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        return myList;
    }

    @Override
    public String getFortune() {
        List<String> myReadFile = this.readFileFortune();
        int rNumber = random.nextInt(myReadFile.size());
        return myReadFile.get(rNumber);
    }
}
