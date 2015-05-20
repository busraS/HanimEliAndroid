package com.example.user.ornekler.model;
import java.util.List;
import java.util.Date;

public class Orders {


        private Long id;

        private Person user;

        private Date orderTime;

        private Date checkTime;

        private Date deliveryTime;


        private List<Food> foods;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Person getUser() {
            return user;
        }

        public void setUser(Person user) {
            this.user = user;
        }

        public Date getOrderTime() {
            return orderTime;
        }

        public void setOrderTime(Date orderTime) {
            this.orderTime = orderTime;
        }

        public Date getCheckTime() {
            return checkTime;
        }

        public void setCheckTime(Date checkTime) {
            this.checkTime = checkTime;
        }

        public Date getDeliveryTime() {
            return deliveryTime;
        }

        public void setDeliveryTime(Date deliveryTime) {
            this.deliveryTime = deliveryTime;
        }

        public List<Food> getFoods() {
            return foods;
        }

        public void setFoods(List<Food> foods) {
            this.foods = foods;
        }



        @Override
        public String toString() {
            return "com.dukefuns.hanimeliweb.model.Order[ id=" + id + " ]";
        }



}
