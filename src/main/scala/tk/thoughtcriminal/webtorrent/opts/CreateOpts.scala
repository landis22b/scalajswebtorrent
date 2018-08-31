package tk.thoughtcriminal.webtorrent.opts

import scala.scalajs.js
import scala.scalajs.js.Date
import scala.scalajs.js.annotation.JSName

trait CreateOpts {
  val name: JSString = js.undefined
  val comment: JSString = js.undefined
  val createdBy: JSString = js.undefined
  val creationDate: js.UndefOr[Date] = js.undefined
  @JSName("private")
  val priv: JSBoolean = js.undefined
  val pieceLength: JSInt = js.undefined
  val announceList: JSArray[JSArray[String]] = js.undefined
  val urlListL: JSArray[String] = js.undefined
}

//
//{
//  name: String,            // name of the torrent (default = basename of `path`, or 1st file's name)
//  comment: String,         // free-form textual comments of the author
//  createdBy: String,       // name and version of program used to create torrent
//  creationDate: Date       // creation time in UNIX epoch format (default = now)
//  private: Boolean,        // is this a private .torrent? (default = false)
//  pieceLength: Number      // force a custom piece length (number of bytes)
//  announceList: [[String]] // custom trackers (array of arrays of strings) (see [bep12](http://www.bittorrent.org/beps/bep_0012.html))
//  urlList: [String]        // web seed urls (see [bep19](http://www.bittorrent.org/beps/bep_0019.html))
//}