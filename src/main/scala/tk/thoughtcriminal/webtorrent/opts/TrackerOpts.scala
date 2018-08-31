package tk.thoughtcriminal.webtorrent.opts


import scala.scalajs.js
import scala.scalajs.js.|

//TODO - consider implementing buffer type
trait TrackerOpts {
  val infoHash: JSString = js.undefined
  val peerId: JSString = js.undefined
  val announce: js.UndefOr[String | js.Array[String]] = js.undefined
  val port: JSInt = js.undefined
  val getAnnounceOpts: GetAnnounceOpts = js.undefined
  val rtcConfig: js.UndefOr[js.Object] = js.undefined
  val userAgent: JSString = js.undefined
  @deprecated
  val wrtc: js.UndefOr[js.Any] = js.undefined
}
