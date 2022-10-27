/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luke
 */
public class Book {
    private String ititle;
    private int ipages;
    private int iyear;
    
    public Book(String title, int pages, int year) {
        this.ititle = title;
        this.ipages = pages;
        this.iyear = year;
    }
    
    public String getEverything() {
        return getTitle() + ", " + getPages() + ", " + getYear();
    }
    
    public String getTitle() {
        return ititle;    
    }
    public void setTitle(String title) {
        this.ititle = title;
    }
    
    
    public int getPages() {
        return ipages;
    }
    public void setPages(int pages) {
        this.ipages = pages;
    }
    
    public int getYear() {
        return iyear;
    }
    public void setYear(int year) {
        this.iyear = year;
    }
    
}
