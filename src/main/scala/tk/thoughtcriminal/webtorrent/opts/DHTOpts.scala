package tk.thoughtcriminal.webtorrent.opts

import tk.thoughtcriminal.webtorrent.KRPC

import scala.scalajs.js

trait DHTOpts {
  val nodeId: JSString = js.undefined
  val bootstrap: JSArray[String] = js.undefined
  val host: JSBoolean = js.undefined
  val concurrency: JSInt = js.undefined
  val hash: UnknownFunctionSignature = js.undefined
  val krpc: js.UndefOr[KRPC] = js.undefined
  val timeBucketOutdated: JSInt = js.undefined
  val maxAge: JSInt = js.undefined
}

//{
//  nodeId: '',      // 160-bit DHT node ID (Buffer or hex string, default: randomly generated)
//  bootstrap: [],   // bootstrap servers (default: router.bittorrent.com:6881, router.utorrent.com:6881, dht.transmissionbt.com:6881)
//  host: false,     // host of local peer, if specified then announces get added to local table (String, disabled by default)
//  concurrency: 16, // k-rpc option to specify maximum concurrent UDP requests allowed (Number, 16 by default)
//  hash: Function,  // custom hash function to use (Function, SHA1 by default),
//  krpc: krpc(),     // optional k-rpc instance
//  timeBucketOutdated: 900000, // check buckets every 15min
//  maxAge: Infinity  // optional setting for announced peers to time out
//}