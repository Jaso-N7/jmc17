/**
 * An Order Item is a type of:
 *
 *  OrderItem oi = new OrderItem( Quantity, ProductForSale )
 *
 * WHERE:
 * - Quantity is an Double depicting the unit of measure or amount
 *   of the Product for sale
 *   Double was chosen, for the stores that decide to sell an item
 *   as fractional, i.e. 1/4 lb of rice, 1/2 lb of flour, 1.1 kg
 *   of sugar, etc.
 */
package dev.me;

public record OrderItem (double quantity, ProductForSale product) {}
