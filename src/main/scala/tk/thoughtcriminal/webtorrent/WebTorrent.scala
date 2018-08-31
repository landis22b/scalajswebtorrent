package tk.thoughtcriminal.webtorrent

import org.scalajs.dom.raw.{File, FileList}
import tk.thoughtcriminal.webtorrent.opts.{AddOpts, SeedOpts}

import scala.scalajs.js
import scala.scalajs.js.|

class WebTorrent {
  def add(torrentId: String, opts: js.UndefOr[AddOpts], onTorrent: JSCB[Torrent]): Unit = js.native

  def seed(input: File | String | FileList, opts: js.UndefOr[SeedOpts], onSeed: JSCB[Torrent]) = js.native
}

@js.native
object WebTorrent {
  def WEBRTC_SUPPORT: Boolean = js.native
}

