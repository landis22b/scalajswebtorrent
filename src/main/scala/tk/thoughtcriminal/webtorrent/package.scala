package tk.thoughtcriminal

import scala.scalajs.js

package object webtorrent {
  type JSCB[T] = js.UndefOr[js.Function1[T, Unit]]
}
