package tk.thoughtcriminal.webtorrent

import scala.scalajs.js
import scala.scalajs.js.{Date, Function}

package object opts {
  type JSInt = js.UndefOr[Int]
  type JSString = js.UndefOr[String]
  type JSArray[T] = js.UndefOr[js.Array[T]]
  type GetAnnounceOpts = js.UndefOr[js.Function0[AnnounceOpts]]
  type JSBoolean = js.UndefOr[Boolean]
  type JSDate = js.UndefOr[Date]
  type UnknownFunctionSignature = js.UndefOr[Function]
}
