package com.example.user.ornekler.model;

/**
 * Created by USER on 12.4.2015.
 */
public class QuantityPrice {
        private Long id;
        private Food food;
        private String quantity;
        private String price;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Food getFood() {
            return food;
        }

        public void setFood(Food food) {
            this.food = food;
        }

        public String getQuantity() {
            return quantity;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }


        @Override
        public String toString() {
            return "com.dukefuns.hanimeliweb.model.QuantityPrice[ id=" + id + " ]";
        }

}
