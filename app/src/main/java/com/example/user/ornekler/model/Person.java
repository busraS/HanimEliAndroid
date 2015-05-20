package com.example.user.ornekler.model;
import java.util.List;
import java.util.ArrayList;
/** asda
 * Created by USER on 12.4.2015.
 */
public class Person {

        private int id;

        private String name;
        private String lastname;

        private String email;
        private String username;
        private String password;
        private String telNo;

        private Address adres;

        private Permission permission;
        private List<Comment> comments;

        public Person() {
            comments = new ArrayList<>();
        }
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getTelNo() {
            return telNo;
        }

        public void setTelNo(String telNo) {
            this.telNo = telNo;
        }

        public Address getAdres() {
            return adres;
        }

        public void setAdres(Address adres) {
            this.adres = adres;
        }

        public Permission getPermission() {
            return permission;
        }

        public void setPermission(Permission permission) {
            this.permission = permission;
        }

        public List<Comment> getComments() {
            return comments;
        }

        public void setComments(List<Comment> comments) {
            this.comments = comments;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void addComment(Comment comment) {
            this.comments.add(comment);
        }
        public Comment getCommentByIndex(int index){
            return this.comments.get(index);
        }
        @Override
        public String toString() {
            return "com.dukefuns.hanimeliweb.model.User[ id=" + id + " ]";
        }


}
