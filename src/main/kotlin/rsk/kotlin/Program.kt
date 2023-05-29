package rsk.kotlin

import rsk.java.Created
import rsk.java.User

fun main ( args:Array<String>){
    var user=User("Kennedy")
    var  count=0
    //event listener uses SAM constructor
    var eventListener= Created({println("user $it has been created :${++count} times")})
       /*
    creates takes in a lambda then it creates anonymous class
    $it is the reason toString was used on the user class
    */

    user.create (eventListener)
    user.create { println("user $it has been created :${++count} times") }

}