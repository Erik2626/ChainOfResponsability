/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Bancooo;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

/**
 *
 * @author ESTACION
 */
public interface Banco {
    Banco setNext (Banco nextBanco);
    void bancoRequest(Request request);
    default boolean canBanco(Request request){
    return false;
    }
    Banco getNext();
}
