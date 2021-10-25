package test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import FA.*;
import org.junit.Test;
import FA.Exp;
public class test {

    @Test
   public void test1() throws IOException {
        Checkanswer c=new Checkanswer();
    }
    @Test
    public void test2()
            throws IOException  {
        Create create=new Create();
        create.cr(10000, 10);

}
    @Test
    public void test3(){
    Random random=new Random();

    System.out.println(Exp.fraction_create(10));

    }
    @Test
    public void test4(){
        Random random=new Random();

        System.out.println(Exp.operator_create());
}
    @Test
    public void test5(){
        Random random=new Random();

        System.out.println(Exp.getexp(10));
}
    @Test
    public void test6(){

        System.out.println(CL.getValue("+"));
}
    @Test
    public void test7(){

        System.out.println(CL.isfra((char) 1));
}
    @Test
    public void test8()
            throws IOException{
        BufferedReader brex=new BufferedReader(new FileReader("C:\\Users\\lenovo\\IdeaProjects\\chezp123\\Grade.txt"));
        BufferedReader bran=new BufferedReader(new FileReader("C:\\Users\\lenovo\\IdeaProjects\\chezp123\\Grade.txt"));

    }
    @Test
    public void test9(){

        System.out.println(CL.calculate("1+2"));
    }
    @Test
    public void test10(){

        System.out.println(CL.getcnki("1+6"));
    }
}

