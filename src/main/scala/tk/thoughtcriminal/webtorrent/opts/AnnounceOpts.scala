package tk.thoughtcriminal.webtorrent.opts

import tk.thoughtcriminal.webtorrent.JSInt

import scala.scalajs.js

trait AnnounceOpts {
  val uploaded: JSInt = js.undefined
  val downloaded: JSInt = js.undefined

  def left: JSInt = js.undefined
}
