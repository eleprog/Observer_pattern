package com.mycompany.observer_files;

import java.io.File;
import java.util.ArrayList;

public class Observer_files
{
    public static void main(String[] args) throws InterruptedException
    {
        ArrayList<FileObj> fileList = new ArrayList();
        
        FileObj fileObserv = new FileObj("G:\\test.txt");
        
        fileObserv.
        /*while(true)
        {
            Thread.sleep(1000);
            if(fileObserv.update())
                System.out.println(fileObserv.getUpdateMessage());
        }*/
    }
}
