package io.github.yexiaoxiaogo.signin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("io.github.yexiaoxiaogo.signin.dao")
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	SpringApplication.run(App.class, args);
    }
}
