/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author PC PHUC
 */

@Builder
@Getter
@Setter
@ToString

public class Order {
    private int orderID;
    private int userID;
    private int totalPrice;
    private int cusID;
}
