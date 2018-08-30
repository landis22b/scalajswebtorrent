package tk.thoughtcriminal.webtorrent

import scala.scalajs.js
import scala.scalajs.js.|

//TODO - consider implementing buffer type
trait TrackerOpts {
  val infoHash: JSString = js.undefined
  val peerId: JSString = js.undefined
  val announce: js.UndefOr[String | js.Array[String]] = js.undefined
  val port: JSInt = js.undefined
  val getAnnounceOpts: js.UndefOr[js.Function0[js.Object]] = js.undefined
}


//* @param {Object} opts                          options object
//* @param {string|Buffer} opts.infoHash          torrent info hash
//* @param {string|Buffer} opts.peerId            peer id
//* @param {string|Array.<string>} opts.announce  announce
//* @param {number} opts.port                     torrent client listening port
//* @param {function} opts.getAnnounceOpts        callback to provide data to tracker
//* @param {number} opts.rtcConfig                RTCPeerConnection configuration object
//* @param {number} opts.userAgent                User-Agent header for http requests
//* @param {number} opts.wrtc                     custom webrtc impl (useful in node.js)