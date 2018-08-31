package tk.thoughtcriminal.webtorrent.opts


import scala.scalajs.js
import scala.scalajs.js.|

//TODO - consider supporting Buffer type
trait ClientOpts extends js.Object {
  val maxConns: JSInt = js.undefined
  val nodeId: JSString = js.undefined
  val peerId: JSString = js.undefined
  val tracker: js.UndefOr[Boolean | TrackerOpts] = js.undefined
  val dht: js.UndefOr[Boolean | DHTOpts] = js.undefined
  val webSeeds: JSBoolean = js.undefined
}

//{
//  maxConns: Number,        // Max number of connections per torrent (default=55)
//  nodeId: String|Buffer,   // DHT protocol node ID (default=randomly generated)
//  peerId: String|Buffer,   // Wire protocol peer ID (default=randomly generated)
//  tracker: Boolean|Object, // Enable trackers (default=true), or options object for Tracker
//  dht: Boolean|Object,     // Enable DHT (default=true), or options object for DHT
//  webSeeds: Boolean        // Enable BEP19 web seeds (default=true)
//}