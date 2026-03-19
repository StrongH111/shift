package com.oop.test4;

public class Book {
/*  自定义图书类
    设定属性包括:书名bookName，作者author,价格price;
    方法包括:相应属性的get/set方法，图书信息介绍等。*/
    //将属性私有化，禁止在类外直接访问
    private  String bookName;
    private String author;
    private double price;

    public static void main(String[] args) {
        //先创建对象
        Book book  = new Book();
        book.setBookName("Java从入门到精通");
        book.setAuthor("张三");
        book.setPrice(99.9);
        System.out.println(book.getAuthor());
        System.out.println(book.getBookName());
        System.out.println(book.getPrice());
    }
    //用get\set方法访问属性
    public void setBookName(String bookName){
        if(bookName != null){
            this.bookName = bookName;
        }else{
            System.out.println("您输入的信息有误");
        }
    }
    public void setAuthor(String author){
        if(author != null){
            this.author = author;
        }else{
            System.out.println("您输入的信息有误");
        }
    }
    public void setPrice(double price){
        if(price > 0){
            this.price = price;
        }else{
            System.out.println("您输入的信息有误");
        }
    }
    public String getBookName(){
        return bookName;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }

}
