/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatheque;

/**
 *
 * @author mborde01
 */
public abstract class Printer implements Visitor{
    @Override
    public void visit(Book item){
        System.out.println("Livre :"+item);
    };
    @Override
    public void visit(CD item){
        System.out.println("CD :"+item);
    };
}
