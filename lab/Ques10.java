package com.lab;

enum Students{Suchita, Deepak, Vikash, Charu, Mahtab}

public class Ques10 {

public static void main(String args[]) {

Students student;

student = Students.Vikash;

switch(student) {

case Suchita: System.out.println("My name is Suchita");

break;

case Deepak: System.out.println("My name is Deepak");

break;

case Vikash: System.out.println("My name is Vikash");

break;

case Charu: System.out.println("My name is Charu");

break;

case Mahtab: System.out.println("My name is Mahtab");

break;

}

}
}
