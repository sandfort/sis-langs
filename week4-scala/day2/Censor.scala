import scala.collection.mutable.HashMap;

trait Censor {
    var m = new HashMap[String, String]
    def censor(word:String):String = if(m.contains(word)) m(word) else word
}

