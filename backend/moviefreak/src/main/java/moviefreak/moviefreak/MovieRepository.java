/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

 package moviefreak.moviefreak;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

 /**
  *
  * @author akt
  */
  // what is this interface and iske generic templae mein kya arguments mai pass kar raha hu
  @Repository
 public interface MovieRepository extends MongoRepository<Movies, ObjectId>{
 
 }
 