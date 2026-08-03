package com.sixray.cepat

/**
 * Application configuration constants.
 */
object AppConfig {
    const val ANG_PACKAGE = "com.sixray.cepat"

    // Preferences keys
    const val PREF_ENABLE_LOCAL_PROXY = "pref_enable_local_proxy"
    const val PREF_PROXY_SHARING = "pref_proxy_sharing_enabled"
    const val PREF_IS_BOOTED = "pref_is_booted"
    const val PREF_ROUTING_RULESETS = "pref_routing_rulesets"
    const val PREF_LANGUAGE = "pref_language"
    const val PREF_UI_MODE_NIGHT = "pref_ui_mode_night"
    const val PREF_SPEED_ENABLED = "pref_speed_enabled"
    const val PREF_SNIFFING_ENABLED = "pref_sniffing_enabled"
    const val PREF_ROUTE_ONLY_ENABLED = "pref_route_only_enabled"
    const val PREF_ROUTING_CUSTOM = "pref_routing_custom"
    const val PREF_VPN_MTU = "pref_vpn_mtu"
    const val PREF_FRAGMENT_ENABLED = "pref_fragment_enabled"
    const val PREF_FRAGMENT_PACKETS = "pref_fragment_packets"
    const val PREF_FRAGMENT_LENGTH = "pref_fragment_length"
    const val PREF_FRAGMENT_INTERVAL = "pref_fragment_interval"
    const val PREF_FRAGMENT_MAXSPLIT = "pref_fragment_maxsplit"
    const val PREF_MUX_ENABLED = "pref_mux_enabled"
    const val PREF_MUX_CONCURRENCY = "pref_mux_concurrency"
    const val PREF_MUX_XUDP_CONCURRENCY = "pref_mux_xudp_concurrency"
    const val PREF_MUX_XUDP_QUIC = "pref_mux_xudp_quic"
    const val PREF_OBSERVATORY_LEAST_PING_INTERVAL = "pref_observatory_least_ping_interval"
    const val PREF_OBSERVATORY_LEAST_LOAD_INTERVAL = "pref_observatory_least_load_interval"
    const val PREF_OBSERVATORY_LEAST_LOAD_METHOD = "pref_observatory_least_load_method"
    const val PREF_OBSERVATORY_LEAST_LOAD_SAMPLING = "pref_observatory_least_load_sampling"
    const val PREF_OBSERVATORY_LEAST_LOAD_TIMEOUT = "pref_observatory_least_load_timeout"
    const val PREF_DELAY_TEST_URL = "pref_delay_test_url"
    const val PREF_IP_API_URL = "pref_ip_api_url"
    const val PREF_LOGLEVEL = "pref_core_loglevel"
    const val PREF_OUTBOUND_DOMAIN_RESOLVE_METHOD = "pref_outbound_domain_resolve_method"
    const val PREF_MODE = "pref_mode"

    const val PREF_CONFIRM_REMOVE = "pref_confirm_remove"
    const val PREF_DOUBLE_COLUMN_DISPLAY = "pref_double_column_display"
    const val PREF_GROUP_ALL_DISPLAY = "pref_group_all_display"
    const val PREF_PREFER_IPV6 = "pref_prefer_ipv6"
    const val PREF_IPV6_ENABLED = "pref_ipv6_enabled"

    // App URLs and endpoints
    const val DELAY_TEST_URL = "https://www.google.com/generate_204"
    const val DELAY_TEST_URL2 = "https://gstatic.com/generate_204"
    const val PREF_REAL_PING_CONCURRENCY = "pref_real_ping_concurrency"
    const val IP_API_URL = "https://api.ip.sb/geoip"

    /** DNS server addresses. */
    const val DNS_PROXY = "https://dns.adguard-dns.com/dns-query"
    const val DNS_DIRECT = "94.140.15.15"
    const val DNS_VPN = "94.140.14.14"
    const val DNS_HOSTS_DEFAULT = "dns.adguard-dns.com:94.140.14.14"
    const val GEOSITE_PRIVATE = "geosite:private"
    const val GEOSITE_CN = "geosite:cn"
    const val GEOIP_PRIVATE = "geoip:private"
    const val GEOIP_CN = "geoip:cn"

    /** Geo data file names. */
    const val GEOSITE_DAT = "geosite.dat"
    const val GEOIP_DAT = "geoip.dat"
    const val GEOIP_ONLY_CN_PRIVATE_DAT = "geoip-only-cn-private.dat"
    const val GEOIP_ONLY_CN_PRIVATE_URL = "$GITHUB_RAW_URL/Loyalsoldier/geoip/release/$GEOIP_ONLY_CN_PRIVATE_DAT"

    /** Ports and addresses for various services. */
    const val PORT_LOCAL_DNS = "10853"
    const val PORT_SOCKS = "10808"
    const val WIREGUARD_LOCAL_ADDRESS_V4 = "172.16.0.2/32"
    const val WIREGUARD_LOCAL_ADDRESS_V6 = "2606:4700:110:8f81:d551:a0:532e:a2b3/128"
    const val WIREGUARD_LOCAL_MTU = "1420"
    const val LOOPBACK = "127.0.0.1"

    /** Message constants for communication. */
    const val MSG_REGISTER_CLIENT = 1
    const val MSG_STATE_RUNNING = 11
    const val MSG_STATE_NOT_RUNNING = 12
    const val MSG_UNREGISTER_CLIENT = 2
    const val MSG_STATE_START = 3
    const val MSG_STATE_START_SUCCESS = 31
    const val MSG_STATE_START_FAILURE = 32
    const val MSG_STATE_STOP = 4
    const val MSG_STATE_STOP_SUCCESS = 41
    const val MSG_STATE_RESTART = 5
    const val MSG_MEASURE_DELAY = 6
    const val MSG_MEASURE_DELAY_SUCCESS = 61
    const val MSG_MEASURE_CONFIG_START = 7
    const val MSG_MEASURE_CONFIG_CANCEL = 71
    const val MSG_MEASURE_CONFIG_SUCCESS = 72
    const val MSG_MEASURE_CONFIG_NOTIFY = 73
    const val MSG_MEASURE_CONFIG_FINISH = 74
    const val MSG_SUB_UPDATE_START = 8
    const val MSG_SUB_UPDATE_CANCEL = 81

    /** Notification channel IDs and names. */
    const val RAY_NG_CHANNEL_ID = "CORE_M_CH_ID_V2"
    const val RAY_NG_CHANNEL_NAME = "Core Background Service"

    /** Protocols Scheme **/
    const val VMESS = "vmess://"
    const val CUSTOM = ""
    const val SHADOWSOCKS = "ss://"
    const val SOCKS = "socks://"
    const val SOCKS4 = "socks4://"
    const val SOCKS5 = "socks5://"
    const val HTTP = "http://"
    const val VLESS = "vless://"
    const val TROJAN = "trojan://"
    const val WIREGUARD = "wireguard://"
    const val TUIC = "tuic://"
    const val HYSTERIA = "hysteria://"
    const val HYSTERIA2 = "hysteria2://"
    const val HY2 = "hy2://"
    const val V2RAYNFMTS = "v2rayn://"

    /** Give a good name to this, IDK*/
    const val VPN = "VPN"
    const val VPN_MTU = 1500

    /** Root (system-wide) mode runtime constants. */
    const val ROOT_RUNTIME_DIR = "sys_cache"
    const val ROOT_IPTABLES_CHAIN = "CORE_FILTER"
    const val ROOT_FWMARK = 255            // defensive RETURN tag; hev's only upstream socket is loopback (already bypassed)
    const val ROOT_MARK_ROUTE = 1          // packets we want pushed into the tun device
    const val ROOT_ROUTE_TABLE = 2024
    const val ROOT_RULE_PRIORITY = 1000
    const val ROOT_TUN_NAME = "utun7788"
    const val ROOT_TUN_ADDR_V4 = "198.18.0.1/15"
    const val ROOT_TUN_ADDR_V6 = "fdfe:dcba:9876::1/64"
    const val ROOT_TUN2SOCKS_BIN = "libhevsockstun.so"
    const val ROOT_FWD_CHAIN = "CORE_FWD"   // FORWARD chain for LAN/tethering sharing
    const val ROOT_DNS_CHAIN = "CORE_DNS"   // nat chain for tethered-client DNS DNAT
    const val ROOT_V6_CHAIN = "CORE6_FILTER"       // ip6tables filter/OUTPUT chain: blackhole native IPv6 when it isn't tunneled
    const val ROOT_V6_FWD_CHAIN = "CORE6_FWD" // ip6tables FORWARD chain: route or reject tethered clients' native IPv6
    const val ROOT_V6_PRE_CHAIN = "CORE6_PRE" // ip6tables mangle/PREROUTING chain: mark forwarded clients' IPv6 into the tun
    const val ROOT_LAN_DNS = "1.1.1.1"          // fallback resolver for tethered clients when no plain-IPv4 DNS is configured
    const val ROOT_OOM_SCORE = "-1000"          // oom_score_adj that makes the LMK never kill us

    /** hev-sock5-tunnel read-write-timeout value */
    const val HEVTUN_RW_TIMEOUT = "300,60"

    // Google API rule constants
    const val GOOGLEAPIS_CN_DOMAIN = "domain:googleapis.cn"
    const val GOOGLEAPIS_COM_DOMAIN = "googleapis.com"

    // Android Private DNS constants
    const val DNS_ALIDNS_DOMAIN = "dns.alidns.com"
    const val DNS_CISCO_SSE_DOMAIN = "dns.sse.cisco.com"
    const val DNS_CISCO_UMBRELLA_DOMAIN = "dns.umbrella.com"
    const val DNS_CLOUDFLARE_ONE_DOMAIN = "one.one.one.one"
    const val DNS_CLOUDFLARE_ONEDOT_DNS_DOMAIN = "1dot1dot1dot1.cloudflare-dns.com"
    const val DNS_CLOUDFLARE_DNS_COM_DOMAIN = "dns.cloudflare.com"
    const val DNS_CLOUDFLARE_DNS_DOMAIN = "cloudflare-dns.com"
    const val DNS_CLOUDFLARE_WARP_DOMAIN = "engage.cloudflareclient.com"
    const val DNS_DNSPOD_DOH_DOMAIN = "doh.pub"
    const val DNS_DNSPOD_DOT_DOMAIN = "dot.pub"
    const val DNS_GOOGLE_DOMAIN = "dns.google"
    const val DNS_QUAD9_DOMAIN = "dns.quad9.net"
    const val DNS_SB_DOMAIN = "dns.sb"
    const val DNS_YANDEX_DOMAIN = "common.dot.dns.yandex.net"

    const val DEFAULT_PORT = 443
    const val DEFAULT_SECURITY = "auto"
    const val DEFAULT_LEVEL = 8
    const val DEFAULT_NETWORK = "tcp"

    const val TLS = "tls"
    const val REALITY = "reality"
    const val HEADER_TYPE_HTTP = "http"
    const val UNIDENTIFIED_PACKAGE = "__unknown_app__"

    val DNS_ALIDNS_ADDRESSES = arrayListOf("223.5.5.5", "223.6.6.6", "2400:3200::1", "2400:3200:baba::1")
    val DNS_CISCO_SSE_ADDRESSES = arrayListOf("208.67.220.220", "208.67.222.222", "2620:119:35::35", "2620:119:53::53")
    val DNS_CISCO_UMBRELLA_ADDRESSES = arrayListOf("208.67.220.220", "208.67.222.222", "2620:119:35::35", "2620:119:53::53")
    val DNS_CLOUDFLARE_ONE_ADDRESSES = arrayListOf("1.1.1.1", "1.0.0.1", "2606:4700:4700::1111", "2606:4700:4700::1001")
    val DNS_CLOUDFLARE_ONEDOT_DNS_ADDRESSES = arrayListOf("1.1.1.1", "1.0.0.1", "2606:4700:4700::1111", "2606:4700:4700::1001")
    val DNS_CLOUDFLARE_DNS_COM_ADDRESSES = arrayListOf("162.159.61.8", "172.64.41.8", "2a06:98c1:52::8", "2803:f800:53::8")
    val DNS_CLOUDFLARE_DNS_ADDRESSES = arrayListOf("104.16.248.249", "104.16.249.249", "2606:4700::6810:f8f9", "2606:4700::6810:f9f9")
    val DNS_CLOUDFLARE_WARP_ADDRESSES = arrayListOf("162.159.192.1", "2606:4700:d0::a29f:c001")
    val DNS_DNSPOD_DOH_ADDRESSES = arrayListOf("1.12.12.12", "120.53.53.53")
    val DNS_DNSPOD_DOT_ADDRESSES = arrayListOf("1.12.12.12", "120.53.53.53")
    val DNS_GOOGLE_ADDRESSES = arrayListOf("8.8.8.8", "8.8.4.4", "2001:4860:4860::8888", "2001:4860:4860::8844")
    val DNS_QUAD9_ADDRESSES = arrayListOf("9.9.9.9", "149.112.112.112", "2620:fe::fe", "2620:fe::9")
    val DNS_SB_ADDRESSES = arrayListOf("45.11.45.11", "185.222.222.222", "2a09::", "2a11::")
    val DNS_YANDEX_ADDRESSES = arrayListOf("77.88.8.8", "77.88.8.1", "2a02:6b8::feed:0ff", "2a02:6b8:0:1::feed:0ff")

    //minimum list https://serverfault.com/a/304791
    val ROUTED_IP_LIST = arrayListOf(
        "0.0.0.0/5",
        "8.0.0.0/7",
        "11.0.0.0/8",
        "12.0.0.0/6",
        "16.0.0.0/4",
        "32.0.0.0/3",
        "64.0.0.0/2",
        "128.0.0.0/3",
        "160.0.0.0/5",
        "168.0.0.0/6",
        "172.0.0.0/12",
        "172.32.0.0/11",
        "172.64.0.0/10",
        "172.128.0.0/9",
        "173.0.0.0/8",
        "174.0.0.0/7",
        "176.0.0.0/4",
        "192.0.0.0/9",
        "192.128.0.0/11",
        "192.160.0.0/13",
        "192.169.0.0/16",
        "192.170.0.0/15",
        "192.172.0.0/14",
        "192.176.0.0/12",
        "192.192.0.0/10",
        "193.0.0.0/8",
        "194.0.0.0/7",
        "196.0.0.0/6",
        "200.0.0.0/5",
        "208.0.0.0/4",
        "240.0.0.0/4"
    )

    val PRIVATE_IP_LIST = arrayListOf(
        "0.0.0.0/8",
        "10.0.0.0/8",
        "127.0.0.0/8",
        "172.16.0.0/12",
        "192.168.0.0/16",
        "169.254.0.0/16",
        "224.0.0.0/4"
    )

    val GEO_FILES_SOURCES = arrayListOf(
        "Loyalsoldier/v2ray-rules-dat",
        "runetfreedom/russia-v2ray-rules-dat",
        "Chocolate4U/Iran-v2ray-rules"
    )

    val BUILTIN_OUTBOUND_TAGS = setOf(
        TAG_PROXY,
        TAG_DIRECT,
        TAG_BLOCKED,
    )

    val OBSERVATORY_DURATION_PATTERN = Regex("""[1-9]\d*(ms|s|m|h)""")
}