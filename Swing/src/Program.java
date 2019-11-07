   class Program
    {
        static void Main(tring[] args)
        {S
            string temp = string.Empty;
            WlanClient client = new WlanClient();
            foreach (WlanClient.WlanInterface wlanIface in client.Interfaces)
            {
                Wlan.WlanBssEntry[] bssworks = wlanIface.GetNetworkBssList();
                foreach (Wlan.WlanBssEntry bsswork in bssworks)
                {
                    temp = ApMac(bsswork.dot11Bssid);
                    //if (!lsApname.Contains(temp = ApMac(bsswork.dot11Bssid)))
                    //{
                    //    continue;
                    //}
                    //lsDatainfo.Add(new dataInfo()
                    //{
                    int rssi = bsswork.rssi;
                    string apssid = GetStringForSSID(bsswork.dot11Ssid);
                    //});
                    //tempApname.Add(temp);
                }
            }
        }
        public static string GetStringForSSID(Wlan.Dot11Ssid ssid)
        {
            return Encoding.ASCII.GetString(ssid.SSID, 0, (int)ssid.SSIDLength);
        }
        public static string ApMac(byte[] macAddr)
        {
            string tMac = "";
            for (int i = 0; i < macAddr.Length; i++)
            {
                tMac += macAddr[i].ToString("x2").PadLeft(2, '0').ToUpper();
            }
            return tMac;
        }
    }