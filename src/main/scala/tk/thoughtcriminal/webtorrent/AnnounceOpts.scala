package tk.thoughtcriminal.webtorrent

import scala.scalajs.js

trait AnnounceOpts {
  val uploaded: JSInt = js.undefined
  val downloaded: JSInt = js.undefined

  def left: JSInt
}
