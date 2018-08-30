package tk.thoughtcriminal.webtorrent

import scala.scalajs.js
import scala.scalajs.js.|

//TODO - consider supporting Buffer type
trait ClientOptions extends js.Object {
  val maxConns: js.UndefOr[Int] = js.undefined
  val nodeId: js.UndefOr[String] = js.undefined
  val peerId: js.UndefOr[String] = js.undefined
  val tracker: js.UndefOr[Boolean | js.Object] = js.undefined
  val dht: js.UndefOr[Boolean | js.Object] = js.undefined
  val webSeeds: js.UndefOr[Boolean] = js.undefined
}


//{
//  maxConns: Number,        // Max number of connections per torrent (default=55)
//  nodeId: String|Buffer,   // DHT protocol node ID (default=randomly generated)
//  peerId: String|Buffer,   // Wire protocol peer ID (default=randomly generated)
//  tracker: Boolean|Object, // Enable trackers (default=true), or options object for Tracker
//  dht: Boolean|Object,     // Enable DHT (default=true), or options object for DHT
//  webSeeds: Boolean        // Enable BEP19 web seeds (default=true)
//}