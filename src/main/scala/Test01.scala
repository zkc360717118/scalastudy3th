//object Test01 {
//  def main(args: Array[String]): Unit = {
//
//  }
//
//  def simplifyAll(expr: Expr): Expr = expr match {
//    case UnOp("-", UnOp("-", e)) =>
//      simplifyAll(e) // `-' is its own inverse
//    case BinOp("+", e, Number(0)) =>
//      simplifyAll(e) // `0' is a neutral element for `+'
//    case BinOp("*", e, Number(1)) =>
//      simplifyAll(e) // `1' is a neutral element for `*'
//    case UnOp(op, e) =>
//      UnOp(op, simplifyAll(e))
//    case BinOp(op, l, r) =>
//      BinOp(op, simplifyAll(l), simplifyAll(r))
//    case _ => expr
//
//}
//
//abstract class Expr
//case class Var(name: String) extends Expr
//case class Number(num: Double) extends Expr
//case class UnOp(operator: String, arg: Expr) extends Expr
//case class BinOp(operator: String,left: Expr, right: Expr) extends Expr
