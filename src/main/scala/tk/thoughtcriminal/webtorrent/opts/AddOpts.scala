package tk.thoughtcriminal.webtorrent.opts

import tk.thoughtcriminal.webtorrent.ChunkStore

import scala.scalajs.js


trait AddOpts {
  val announce: JSArray[String] = js.undefined
  val getAnnounceOpts: GetAnnounceOpts = js.undefined
  val maxWebConns: JSInt = js.undefined
  val path: JSString = js.undefined
  val store: js.UndefOr[ChunkStore] = js.undefined
}

//{
//  announce: [String],        // Torrent trackers to use (added to list in .torrent or magnet uri)
//  getAnnounceOpts: Function, // Custom callback to allow sending extra parameters to the tracker
//  maxWebConns: Number,       // Max number of simultaneous connections per web seed [default=4]
//  path: String,              // Folder to download files to (default=`/tmp/webtorrent/`)
//  store: Function            // Custom chunk store (must follow [abstract-chunk-store](https://www.npmjs.com/package/abstract-chunk-store) API)
//}