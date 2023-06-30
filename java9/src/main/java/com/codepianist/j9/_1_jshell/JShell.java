package com.codepianist.j9._1_jshell;

public interface JShell {

    /*
    --- List all your shells

    jshell> /list
   1 : System.out.println("Hello World!")
   2 : int a = 13;
   3 : System.out.println(a)
   4 : void main(String[] args){
               System.out.println("Hello World");
              }
    --- U can use the number to reference each line
    jshell> /edit 1

    --- Use /n to repeat a line
    jshell> /1
    System.out.println("Hello World!")
    Hello World!

    ---
    jshell> /reset
    |  Resetting state.

    ---
    jshell> /list

    jshell>

    ---
    lists hidden imported libs
    so you can use it without importing
    jshell> /list -start

      s1 : import java.util.*;
      s2 : import java.io.*;
      s3 : import java.math.*;
      s4 : import java.net.*;
      s5 : import java.util.concurrent.*;
      s6 : import java.util.prefs.*;
      s7 : import java.util.regex.*;
      s8 : void printf(String format, Object... args) { System.out.printf(format, args); }

    */



    /*
    -- Save it to a class
    jshell> /save HelloWorld.java


    Use open to load a saved state and execute it
    jshell> /open HelloWorld.java
    Hello World!
    13


     */

    /*
    --- Use /vars to list variables
    jshell> /vars
    |    int a = 13

    -- Use /types to list all your types
    jshell> class s {}
    |  created class s

    jshell> /types
    |    class s

    -- Use /methods to list all your methods
    jshell> /methods
    |    printf (String,Object...)void
    |    main (String[])void
     */

    /*
    --- Use /exit to get out
    jshell> /exit
    |  Goodbye

     */

}
