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
public interface Visitor {
    void visit(Book item);
    void visit(CD item);
}
