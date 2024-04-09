//Already processed
package com.real.estate

import android.app.Activity
import android.app.KeyguardManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.PowerManager
import android.provider.Settings
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.real.estate.attic.AtticNetHelper
import com.real.estate.bedroom.BRoomImpl
import com.real.estate.bedroom.BedroomImp
import com.real.estate.windows.WindowsMan
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.json.JSONObject
import java.security.MessageDigest
import java.util.Locale
import java.util.Random
import java.util.TimeZone

import java.util.UUID

// init code
fun dought(def_var_Int_772: Int): Int {
    var def_var_Int_773: Int = def_var_Int_772 % 20
    var def_var_Int_774: Int = 17
    var def_var_Int_775: Int = 31
    var def_var_Int_776: Int = 11
    var def_var_Int_777: Int = 19
    var def_var_Int_778: Int = 15
    var def_var_Int_779: Int = 0
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_779 = 51 % 7
        def_var_Int_779 = 255 % 23
        def_var_Int_779 = 440 and 18
        def_var_Int_779 = def_var_Int_774 * def_var_Int_773
        def_var_Int_779 = 187 - 17
        def_var_Int_779 = def_var_Int_776 * def_var_Int_775
        def_var_Int_779 = def_var_Int_775 % def_var_Int_776
        def_var_Int_779 = def_var_Int_776 xor 28
        def_var_Int_779 = def_var_Int_774 or def_var_Int_778
        def_var_Int_779 = 838 xor 6
        def_var_Int_779 = 272 + 29
    }
    return def_var_Int_779
}

fun ppm(def_var_Int_780: Int): Int {
    var def_var_String_781: String = "superpersonally"
    var def_var_String_782: String = "unphilosophically"
    var def_var_String_783: String = "muskish"
    var def_var_String_784: String = "dasnt"
    var def_var_String_785: String = "dolichocrany"
    var def_var_String_786: String = "griskin"
    var def_var_String_787: String = "ureterolith"
    var def_var_String_788: String = "keelson"
    var def_var_String_789: String = "gleanable"
    def_var_String_784 = Math.random().toString()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_String_784.equals(def_var_String_782)) {
            def_var_String_784 = def_var_String_785.commonSuffixWith(def_var_String_786)
        } else if (def_var_String_784.contains(def_var_String_788)) {
            def_var_String_784 = def_var_String_783.removeSurrounding(def_var_String_784)
        } else if (def_var_String_786.contains(def_var_String_784)) {
            def_var_String_784 = def_var_String_781.commonPrefixWith("miscredulity")
        } else if (def_var_String_781.startsWith(def_var_String_784)) {
            def_var_String_784 = def_var_String_784.commonPrefixWith("unevolved")
        } else if (def_var_String_783.contains(def_var_String_787)) {
            def_var_String_784 = "baginda".substringAfterLast("outkiss")
        } else if (def_var_String_782.startsWith(def_var_String_784)) {
            def_var_String_784 = def_var_String_782.commonSuffixWith("cowrie")
        } else if (def_var_String_784.endsWith(def_var_String_783)) {
            def_var_String_784 = def_var_String_789.substringBefore(def_var_String_782)
        } else if (def_var_String_785.endsWith(def_var_String_785)) {
            def_var_String_784 = "handkerchiefful".commonSuffixWith("conventically")
        } else if (def_var_String_785.equals(def_var_String_783)) {
            def_var_String_784 = def_var_String_785.substringBefore("ectocarpous")
        } else if (def_var_String_782.contains(def_var_String_783)) {
            def_var_String_784 = "alluvial".substringBefore("peakishness")
        } else if (def_var_String_783.equals(def_var_String_782)) {
            def_var_String_784 = "commemorable".removeSuffix("parella")
        } else if (def_var_String_786.contains(def_var_String_783)) {
            def_var_String_784 = "phyllostomidae".commonPrefixWith("gableended")
        } else if (def_var_String_786.startsWith(def_var_String_782)) {
            def_var_String_784 = def_var_String_788.removePrefix("tallness")
        } else if (def_var_String_787.endsWith(def_var_String_789)) {
            def_var_String_784 = "recode".removePrefix("bahaullah")
        } else if (def_var_String_781.endsWith(def_var_String_786)) {
            def_var_String_784 = def_var_String_782.substringBeforeLast("preministries")
        } else if (def_var_String_782.equals(def_var_String_789)) {
            def_var_String_784 = def_var_String_785.removeSuffix("narcein")
        } else if (def_var_String_784.startsWith(def_var_String_782)) {
            def_var_String_784 = def_var_String_785.substringBeforeLast(def_var_String_788)
        } else if (def_var_String_788.equals(def_var_String_781)) {
            def_var_String_784 = "trachylinae".removePrefix("arseneted")
        } else {
            def_var_String_784 = "glomerulose".substringBefore(def_var_String_781)
        }
    }
//$ def_var_String_784

    if (def_var_String_784.equals("unilamellar")) {
        return def_var_Int_780
    }
    return -1
}

fun faceless(def_var_Int_790: Int): Int {
    var def_var_Int_791: Int = def_var_Int_790 - 13
    var def_var_Int_792: Int = 1
    var def_var_Int_793: Int = 31
    var def_var_Int_794: Int = 21
    var def_var_Int_795: Int = 17
    var def_var_Int_796: Int = 4
    var def_var_Int_797: Int = 21
    var def_var_Int_798: Int = 0
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_798 = 586 - 14
        def_var_Int_798 = def_var_Int_792 % 10
        def_var_Int_798 = def_var_Int_796 and def_var_Int_794
        def_var_Int_798 = def_var_Int_795 or 14
        def_var_Int_798 = def_var_Int_797 / def_var_Int_793
        def_var_Int_798 = def_var_Int_796 * def_var_Int_797
        def_var_Int_798 = def_var_Int_793 / def_var_Int_797
        def_var_Int_798 = def_var_Int_797 - 24
        def_var_Int_798 = 204 * 16
        def_var_Int_798 = 427 % 2
        def_var_Int_798 = def_var_Int_793 * def_var_Int_796
        def_var_Int_798 = def_var_Int_795 / 17
        def_var_Int_798 = 303 / 9
        def_var_Int_798 = def_var_Int_795 xor def_var_Int_794
        def_var_Int_798 = def_var_Int_797 - def_var_Int_795
        def_var_Int_798 = 575 + 28
        def_var_Int_798 = def_var_Int_796 % def_var_Int_792
        def_var_Int_798 = 432 xor 7
        def_var_Int_798 = 199 * 8
    }
    return def_var_Int_798
}

fun cinquecentist(def_var_Int_799: Int): Int {
    var def_var_Int_800: Int = def_var_Int_799 * 19
    var def_var_Int_801: Int = 20
    var def_var_Int_802: Int = 5
    var def_var_Int_803: Int = 26
    var def_var_Int_804: Int = 5
    var def_var_Int_805: Int = 8
    var def_var_Int_806: Int = 0
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_806 = def_var_Int_803 and def_var_Int_802
        def_var_Int_806 = 1012 / 8
        def_var_Int_806 = def_var_Int_800 / 4
        def_var_Int_806 = def_var_Int_804 + def_var_Int_803
        def_var_Int_806 = 670 * 31
        def_var_Int_806 = def_var_Int_803 xor 8
        def_var_Int_806 = def_var_Int_804 + 27
        def_var_Int_806 = def_var_Int_800 % 1
        def_var_Int_806 = def_var_Int_804 and def_var_Int_805
        def_var_Int_806 = 586 % 4
        def_var_Int_806 = def_var_Int_802 - def_var_Int_801
    }
    return def_var_Int_806
}

fun pyloroschesis(def_var_Int_807: Int): Int {
    var def_var_String_808: String = "listedness"
    var def_var_String_809: String = "tdr"
    var def_var_String_810: String = "deceptible"
    var def_var_String_811: String = "compromis"
    var def_var_String_812: String = "ghostship"
    var def_var_String_813: String = "underwrit"
    var def_var_String_814: String = "recontests"
    var def_var_String_815: String = "lavatory"
    var def_var_String_816: String = "reflationism"
    def_var_String_809 = Math.random().toString()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_String_809.equals(def_var_String_816)) {
            def_var_String_809 = def_var_String_810.substringAfterLast(def_var_String_814)
        } else if (def_var_String_816.equals(def_var_String_815)) {
            def_var_String_809 = "ladens".substringAfterLast("worsteds")
        } else if (def_var_String_810.contains(def_var_String_811)) {
            def_var_String_809 = def_var_String_812.substringAfter("riskfulness")
        } else if (def_var_String_813.equals(def_var_String_808)) {
            def_var_String_809 = "unpresentable".substringBeforeLast("allianced")
        } else if (def_var_String_813.startsWith(def_var_String_808)) {
            def_var_String_809 = def_var_String_814.removeSurrounding("arthrodic")
        } else if (def_var_String_815.endsWith(def_var_String_810)) {
            def_var_String_809 = def_var_String_813.removePrefix("mayfowl")
        } else if (def_var_String_816.equals(def_var_String_808)) {
            def_var_String_809 = "lamiinae".substringBeforeLast("bise")
        } else if (def_var_String_814.endsWith(def_var_String_815)) {
            def_var_String_809 = def_var_String_808.substringBefore("orthodolichocephalic")
        } else if (def_var_String_815.contains(def_var_String_816)) {
            def_var_String_809 = def_var_String_813.substringAfter("tycoon")
        } else if (def_var_String_813.endsWith(def_var_String_808)) {
            def_var_String_809 = def_var_String_813.commonSuffixWith("unloader")
        } else if (def_var_String_809.endsWith(def_var_String_813)) {
            def_var_String_809 = def_var_String_814.commonPrefixWith(def_var_String_809)
        } else if (def_var_String_811.startsWith(def_var_String_814)) {
            def_var_String_809 = def_var_String_808.substringAfter("flouncey")
        } else if (def_var_String_812.startsWith(def_var_String_808)) {
            def_var_String_809 = def_var_String_810.substringAfter("congenially")
        } else if (def_var_String_812.contains(def_var_String_810)) {
            def_var_String_809 = "syrtic".substringBeforeLast("lagoonal")
        } else if (def_var_String_809.startsWith(def_var_String_811)) {
            def_var_String_809 = def_var_String_816.substringBefore(def_var_String_809)
        } else {
            def_var_String_809 = "autoneurotoxin".removeSuffix(def_var_String_811)
        }
    }
//$ def_var_String_809

    if (def_var_String_809.startsWith("laurionite")) {
        return def_var_Int_807
    }
    return -1
}

fun semihexagon(def_var_Int_817: Int): Int {
    var def_var_Int_818: Int = def_var_Int_817 + 10
    var def_var_Int_819: Int = 22
    var def_var_Int_820: Int = 15
    var def_var_Int_821: Int = 3
    var def_var_Int_822: Int = 26
    var def_var_Int_823: Int = 2
    var def_var_Int_824: Int = 22
    var def_var_Int_825: Int = 11
    var def_var_Int_826: Int = 0
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_826 = def_var_Int_823 or def_var_Int_825
        def_var_Int_826 = def_var_Int_819 * 4
        def_var_Int_826 = def_var_Int_820 % 27
        def_var_Int_826 = 452 or 13
        def_var_Int_826 = def_var_Int_819 % def_var_Int_820
        def_var_Int_826 = def_var_Int_820 + def_var_Int_823
        def_var_Int_826 = def_var_Int_818 + def_var_Int_821
        def_var_Int_826 = 187 - 28
        def_var_Int_826 = def_var_Int_819 - def_var_Int_823
        def_var_Int_826 = def_var_Int_823 / 3
        def_var_Int_826 = 497 and 18
        def_var_Int_826 = def_var_Int_822 + 22
    }
    return def_var_Int_826
}

fun reprofess(def_var_Int_827: Int): Int {
    var def_var_String_828: String = "pathophoresis"
    var def_var_String_829: String = "recanters"
    var def_var_String_830: String = "haemoflagellate"
    var def_var_String_831: String = "underbreathing"
    var def_var_String_832: String = "unawarely"
    var def_var_String_833: String = "obnoxiety"
    var def_var_String_834: String = "dorsalward"
    var def_var_String_835: String = "assate"
    def_var_String_833 = Math.random().toString()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_String_833.endsWith(def_var_String_835)) {
            def_var_String_833 = def_var_String_833.substringBefore(def_var_String_831)
        } else if (def_var_String_832.startsWith(def_var_String_831)) {
            def_var_String_833 = def_var_String_832.removeSuffix("urodelous")
        } else if (def_var_String_834.contains(def_var_String_828)) {
            def_var_String_833 = def_var_String_835.substringBeforeLast("arousement")
        } else if (def_var_String_833.startsWith(def_var_String_829)) {
            def_var_String_833 = def_var_String_832.removeSurrounding(def_var_String_834)
        } else if (def_var_String_833.contains(def_var_String_828)) {
            def_var_String_833 = def_var_String_835.commonSuffixWith(def_var_String_834)
        } else if (def_var_String_833.startsWith(def_var_String_829)) {
            def_var_String_833 = def_var_String_835.removeSuffix("whitrack")
        } else if (def_var_String_833.startsWith(def_var_String_831)) {
            def_var_String_833 = def_var_String_835.substringAfterLast("nongeometrically")
        } else if (def_var_String_833.endsWith(def_var_String_835)) {
            def_var_String_833 = def_var_String_832.substringBeforeLast(def_var_String_834)
        } else if (def_var_String_833.endsWith(def_var_String_832)) {
            def_var_String_833 = def_var_String_830.commonSuffixWith(def_var_String_833)
        } else if (def_var_String_833.equals(def_var_String_832)) {
            def_var_String_833 = def_var_String_834.commonPrefixWith(def_var_String_835)
        } else if (def_var_String_828.startsWith(def_var_String_829)) {
            def_var_String_833 = def_var_String_835.removePrefix("dolciano")
        } else if (def_var_String_830.contains(def_var_String_834)) {
            def_var_String_833 = "subserviate".substringAfterLast("nonretroactive")
        } else if (def_var_String_835.contains(def_var_String_834)) {
            def_var_String_833 = "nonalkaloidal".removePrefix("pretemptation")
        } else {
            def_var_String_833 = "insensibleness".removeSuffix(def_var_String_830)
        }
    }
//$ def_var_String_833

    if (def_var_String_833.equals("unreluctance")) {
        return def_var_Int_827
    }
    return -1
}

fun preearthquake(def_var_Int_836: Int): Int {
    var def_var_String_837: String = "forestine"
    var def_var_String_838: String = "carzey"
    var def_var_String_839: String = "dubiosities"
    var def_var_String_840: String = "nest"
    var def_var_String_841: String = "equalising"
    var def_var_String_842: String = "isologue"
    var def_var_String_843: String = "reaccusing"
    var def_var_String_844: String = "uncountable"
    var def_var_String_845: String = "fanit"
    def_var_String_837 = Math.random().toString()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_String_837.endsWith(def_var_String_842)) {
            def_var_String_837 = def_var_String_845.substringBefore(def_var_String_838)
        } else if (def_var_String_838.equals(def_var_String_843)) {
            def_var_String_837 = "preprofessional".substringBeforeLast("unrepleteness")
        } else if (def_var_String_837.endsWith(def_var_String_842)) {
            def_var_String_837 = def_var_String_844.removeSuffix(def_var_String_841)
        } else if (def_var_String_837.endsWith(def_var_String_838)) {
            def_var_String_837 = def_var_String_844.commonSuffixWith(def_var_String_842)
        } else if (def_var_String_839.endsWith(def_var_String_841)) {
            def_var_String_837 = "chuffs".commonPrefixWith("overpluses")
        } else if (def_var_String_844.equals(def_var_String_842)) {
            def_var_String_837 = def_var_String_842.removeSurrounding("overcalling")
        } else if (def_var_String_840.endsWith(def_var_String_844)) {
            def_var_String_837 = "schmoes".removeSurrounding("unpreferably")
        } else if (def_var_String_837.startsWith(def_var_String_838)) {
            def_var_String_837 = def_var_String_843.removePrefix(def_var_String_839)
        } else if (def_var_String_837.endsWith(def_var_String_843)) {
            def_var_String_837 = def_var_String_841.commonPrefixWith(def_var_String_837)
        } else if (def_var_String_837.startsWith(def_var_String_838)) {
            def_var_String_837 = def_var_String_843.substringAfter(def_var_String_837)
        } else if (def_var_String_837.startsWith(def_var_String_843)) {
            def_var_String_837 = def_var_String_840.removeSuffix(def_var_String_843)
        } else if (def_var_String_837.contains(def_var_String_844)) {
            def_var_String_837 = def_var_String_837.substringBefore(def_var_String_839)
        } else if (def_var_String_841.equals(def_var_String_837)) {
            def_var_String_837 = def_var_String_838.substringBeforeLast("turbinelloid")
        } else {
            def_var_String_837 = "yangtao".commonPrefixWith(def_var_String_839)
        }
    }
//$ def_var_String_837

    if (def_var_String_837.equals("heartbreaks")) {
        return def_var_Int_836
    }
    return -1
}

fun costectomies(def_var_Int_846: Int): Int {
    var def_var_Long_847: Long = def_var_Int_846.toLong()
    var def_var_Long_848: Long = System.currentTimeMillis()
    var def_var_Long_849: Long = System.currentTimeMillis()
    var def_var_Long_850: Long = System.currentTimeMillis()
    var def_var_Long_851: Long = System.currentTimeMillis()
    var def_var_Long_852: Long = System.currentTimeMillis()
    var def_var_Long_853: Long = System.currentTimeMillis()
    var def_var_Long_854: Long = System.currentTimeMillis()
    var def_var_Long_855: Long = System.currentTimeMillis()
    var def_var_Long_856: Long = System.currentTimeMillis()
    def_var_Long_849 = System.currentTimeMillis()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_Long_849 > def_var_Long_847) {
            def_var_Long_849 = def_var_Long_854 * def_var_Long_853
        } else if (def_var_Long_847 >= def_var_Long_852) {
            def_var_Long_849 = def_var_Long_852 - 29
        } else if (400.toLong() <= def_var_Long_850) {
            def_var_Long_849 = 388 - 13
        } else if (def_var_Long_854 >= def_var_Long_856) {
            def_var_Long_849 = def_var_Long_852 or 24
        } else if (616.toLong() >= def_var_Long_853) {
            def_var_Long_849 = 933 + 11
        } else if (796.toLong() <= def_var_Long_856) {
            def_var_Long_849 = 859 or 8
        } else if (def_var_Long_853 != def_var_Long_852) {
            def_var_Long_849 = def_var_Long_851 + 26
        } else if (952.toLong() < def_var_Long_848) {
            def_var_Long_849 = 156 - 21
        } else if (953.toLong() > def_var_Long_853) {
            def_var_Long_849 = 902 and 21
        } else if (953.toLong() == def_var_Long_852) {
            def_var_Long_849 = 94 and 11
        } else if (def_var_Long_852 == def_var_Long_855) {
            def_var_Long_849 = def_var_Long_848 - 1
        } else if (def_var_Long_849 < def_var_Long_847) {
            def_var_Long_849 = def_var_Long_847 or def_var_Long_855
        } else if (def_var_Long_848 >= def_var_Long_850) {
            def_var_Long_849 = def_var_Long_856 xor 20
        } else if (def_var_Long_849 > def_var_Long_856) {
            def_var_Long_849 = def_var_Long_849 and def_var_Long_850
        } else if (def_var_Long_849 == def_var_Long_847) {
            def_var_Long_849 = def_var_Long_849 xor 17
        } else if (def_var_Long_849 < def_var_Long_852) {
            def_var_Long_849 = def_var_Long_853 and def_var_Long_851
        } else if (def_var_Long_855 < def_var_Long_853) {
            def_var_Long_849 = def_var_Long_852 - 3
        } else {
            def_var_Long_849 = 928.toLong() % def_var_Long_847
        }
    }
    return def_var_Long_849.toInt()
}

fun dishonesty(def_var_Int_857: Int): Int {
    var def_var_String_858: String = "ultraimperialist"
    var def_var_String_859: String = "projet"
    var def_var_String_860: String = "cobriform"
    var def_var_String_861: String = "corroboree"
    var def_var_String_862: String = "cecal"
    var def_var_String_863: String = "cardhouse"
    var def_var_String_864: String = "seminarist"
    var def_var_String_865: String = "everlastingly"
    def_var_String_858 = Math.random().toString()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_String_858.contains(def_var_String_862)) {
            def_var_String_858 = def_var_String_863.removeSurrounding(def_var_String_862)
        } else if (def_var_String_858.startsWith(def_var_String_864)) {
            def_var_String_858 = def_var_String_864.commonPrefixWith(def_var_String_860)
        } else if (def_var_String_860.contains(def_var_String_865)) {
            def_var_String_858 = def_var_String_864.removePrefix("noiseproof")
        } else if (def_var_String_864.endsWith(def_var_String_861)) {
            def_var_String_858 = "stealers".removeSuffix("blastomycin")
        } else if (def_var_String_863.endsWith(def_var_String_859)) {
            def_var_String_858 = def_var_String_859.removeSuffix("cunye")
        } else if (def_var_String_864.startsWith(def_var_String_865)) {
            def_var_String_858 = "outsoaring".substringBefore("virilocally")
        } else if (def_var_String_858.contains(def_var_String_863)) {
            def_var_String_858 = def_var_String_862.substringAfterLast(def_var_String_858)
        } else if (def_var_String_864.startsWith(def_var_String_865)) {
            def_var_String_858 = def_var_String_863.commonPrefixWith("spunky")
        } else if (def_var_String_861.endsWith(def_var_String_863)) {
            def_var_String_858 = def_var_String_859.removeSuffix("multipurpose")
        } else if (def_var_String_858.contains(def_var_String_859)) {
            def_var_String_858 = def_var_String_861.substringBeforeLast(def_var_String_858)
        } else if (def_var_String_860.equals(def_var_String_863)) {
            def_var_String_858 = def_var_String_858.substringAfterLast("nihilistic")
        } else if (def_var_String_861.startsWith(def_var_String_861)) {
            def_var_String_858 = "sphaeropsidales".removeSurrounding("nonmotivation")
        } else if (def_var_String_858.contains(def_var_String_863)) {
            def_var_String_858 = def_var_String_862.substringBefore(def_var_String_860)
        } else if (def_var_String_861.contains(def_var_String_861)) {
            def_var_String_858 = "ability".substringAfter("booster")
        } else if (def_var_String_858.equals(def_var_String_864)) {
            def_var_String_858 = def_var_String_859.substringAfter(def_var_String_862)
        } else if (def_var_String_859.equals(def_var_String_861)) {
            def_var_String_858 = def_var_String_859.substringBefore("episiorrhaphy")
        } else if (def_var_String_865.endsWith(def_var_String_862)) {
            def_var_String_858 = "scumlike".substringBeforeLast("quisqualis")
        } else if (def_var_String_858.endsWith(def_var_String_859)) {
            def_var_String_858 = def_var_String_864.substringBeforeLast(def_var_String_861)
        } else {
            def_var_String_858 = "hypnotizer".commonSuffixWith(def_var_String_865)
        }
    }
//$ def_var_String_858

    if (def_var_String_858.contains("oafdom")) {
        return def_var_Int_857
    }
    return -1
}

fun subantarctic(def_var_Int_866: Int): Int {
    var def_var_Long_867: Long = def_var_Int_866.toLong()
    var def_var_Long_868: Long = System.currentTimeMillis()
    var def_var_Long_869: Long = System.currentTimeMillis()
    var def_var_Long_870: Long = System.currentTimeMillis()
    var def_var_Long_871: Long = System.currentTimeMillis()
    var def_var_Long_872: Long = System.currentTimeMillis()
    def_var_Long_869 = System.currentTimeMillis()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_Long_869 == def_var_Long_870) {
            def_var_Long_869 = def_var_Long_869 xor def_var_Long_872
        } else if (def_var_Long_869 != def_var_Long_867) {
            def_var_Long_869 = def_var_Long_870 xor def_var_Long_869
        } else if (def_var_Long_869 > def_var_Long_871) {
            def_var_Long_869 = def_var_Long_867 * def_var_Long_869
        } else if (def_var_Long_870 <= def_var_Long_869) {
            def_var_Long_869 = def_var_Long_869 - 18
        } else if (232.toLong() < def_var_Long_868) {
            def_var_Long_869 = 553 % 18
        } else if (def_var_Long_871 < def_var_Long_868) {
            def_var_Long_869 = def_var_Long_872 - 21
        } else if (def_var_Long_869 >= def_var_Long_872) {
            def_var_Long_869 = def_var_Long_872 / def_var_Long_868
        } else if (851.toLong() < def_var_Long_871) {
            def_var_Long_869 = 461 % 20
        } else if (def_var_Long_870 <= def_var_Long_869) {
            def_var_Long_869 = def_var_Long_867 - 23
        } else if (def_var_Long_867 <= def_var_Long_869) {
            def_var_Long_869 = def_var_Long_870 * 3
        } else if (def_var_Long_869 != def_var_Long_871) {
            def_var_Long_869 = def_var_Long_872 % 21
        } else if (def_var_Long_869 > def_var_Long_870) {
            def_var_Long_869 = def_var_Long_867 - def_var_Long_871
        } else if (def_var_Long_869 > def_var_Long_871) {
            def_var_Long_869 = def_var_Long_869 and def_var_Long_870
        } else if (158.toLong() >= def_var_Long_871) {
            def_var_Long_869 = 399 + 27
        } else if (def_var_Long_869 >= def_var_Long_867) {
            def_var_Long_869 = def_var_Long_872 xor def_var_Long_870
        } else if (def_var_Long_869 > def_var_Long_872) {
            def_var_Long_869 = def_var_Long_868 / def_var_Long_870
        } else if (def_var_Long_869 > def_var_Long_868) {
            def_var_Long_869 = def_var_Long_867 - def_var_Long_872
        } else if (def_var_Long_869 >= def_var_Long_867) {
            def_var_Long_869 = def_var_Long_867 xor def_var_Long_870
        } else {
            def_var_Long_869 = 85.toLong() or def_var_Long_871
        }
    }
    return def_var_Long_869.toInt()
}

fun sech(def_var_Int_873: Int): Int {
    var def_var_String_874: String = "freeloving"
    var def_var_String_875: String = "serialise"
    var def_var_String_876: String = "realgars"
    var def_var_String_877: String = "shortcomings"
    var def_var_String_878: String = "unparalleled"
    var def_var_String_879: String = "overcoil"
    def_var_String_876 = Math.random().toString()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_String_876.contains(def_var_String_878)) {
            def_var_String_876 = def_var_String_875.commonPrefixWith(def_var_String_876)
        } else if (def_var_String_877.endsWith(def_var_String_879)) {
            def_var_String_876 = def_var_String_879.commonPrefixWith("gonothecal")
        } else if (def_var_String_876.endsWith(def_var_String_878)) {
            def_var_String_876 = def_var_String_877.substringBeforeLast("scuddick")
        } else if (def_var_String_875.endsWith(def_var_String_879)) {
            def_var_String_876 = "sympathique".substringBefore("aganice")
        } else if (def_var_String_877.endsWith(def_var_String_878)) {
            def_var_String_876 = def_var_String_876.removeSurrounding("olonetsian")
        } else if (def_var_String_876.equals(def_var_String_878)) {
            def_var_String_876 = def_var_String_875.commonSuffixWith(def_var_String_877)
        } else if (def_var_String_876.endsWith(def_var_String_874)) {
            def_var_String_876 = def_var_String_875.removeSuffix("rejudgement")
        } else if (def_var_String_875.contains(def_var_String_877)) {
            def_var_String_876 = def_var_String_878.removePrefix("noctilucence")
        } else if (def_var_String_878.startsWith(def_var_String_879)) {
            def_var_String_876 = "chevrotain".substringBefore("crumble")
        } else if (def_var_String_876.startsWith(def_var_String_874)) {
            def_var_String_876 = def_var_String_874.removeSuffix("geometricize")
        } else if (def_var_String_876.startsWith(def_var_String_877)) {
            def_var_String_876 = def_var_String_877.substringBeforeLast(def_var_String_874)
        } else if (def_var_String_879.startsWith(def_var_String_879)) {
            def_var_String_876 = "culmed".commonPrefixWith("abitibi")
        } else if (def_var_String_876.startsWith(def_var_String_874)) {
            def_var_String_876 = def_var_String_874.removeSurrounding(def_var_String_878)
        } else if (def_var_String_878.endsWith(def_var_String_878)) {
            def_var_String_876 = "yelm".substringAfterLast("gaumish")
        } else if (def_var_String_875.startsWith(def_var_String_879)) {
            def_var_String_876 = "skepticalness".substringAfter("hygrophaneity")
        } else if (def_var_String_876.equals(def_var_String_879)) {
            def_var_String_876 = def_var_String_874.commonPrefixWith(def_var_String_875)
        } else if (def_var_String_879.equals(def_var_String_874)) {
            def_var_String_876 = def_var_String_878.substringBefore("pneumodynamics")
        } else {
            def_var_String_876 = "mantisia".substringAfter(def_var_String_875)
        }
    }
//$ def_var_String_876

    if (def_var_String_876.startsWith("angulous")) {
        return def_var_Int_873
    }
    return -1
}

fun administratrices(def_var_Int_880: Int): Int {//Function call
    var def_var_Int_881: Int = 983
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_881 = reprofess(982) % faceless(def_var_Int_881)
        def_var_Int_881 = dought(420)
        def_var_Int_881 = costectomies(674) - sech(def_var_Int_881)
        def_var_Int_881 = cinquecentist(574) - subantarctic(def_var_Int_880)
        def_var_Int_881 = sech(935)
        def_var_Int_881 = cinquecentist(236)
        def_var_Int_881 = subantarctic(def_var_Int_880)
        def_var_Int_881 = sech(895) / cinquecentist(def_var_Int_880)
        def_var_Int_881 = reprofess(def_var_Int_880)
        def_var_Int_881 = ppm(329) xor pyloroschesis(def_var_Int_880)
        def_var_Int_881 = cinquecentist(618)
        def_var_Int_881 = sech(510) * subantarctic(def_var_Int_881)
    }
    return def_var_Int_881
}

fun plesianthropus(def_var_Int_882: Int): Int {//Function call(fork)
    var def_var_Int_883: Int = 570
    if (System.currentTimeMillis().toInt() == 0) {
        if (faceless(def_var_Int_883) != 126) {
        } else if (dishonesty(def_var_Int_883) >= 99) {
            def_var_Int_883 = semihexagon(608)
            def_var_Int_883 = cinquecentist(def_var_Int_883) or sech(def_var_Int_883)
        } else if (ppm(def_var_Int_883) <= 402) {
            def_var_Int_883 = administratrices(957)
        } else if (reprofess(def_var_Int_883) >= 334) {
            def_var_Int_883 = pyloroschesis(574)
            def_var_Int_883 = administratrices(def_var_Int_883) % sech(def_var_Int_883)
        } else if (cinquecentist(def_var_Int_883) == ppm(899)) {
            def_var_Int_883 = dishonesty(def_var_Int_883)
        } else if (dought(def_var_Int_883) > 912) {
            def_var_Int_883 = sech(946)
            def_var_Int_883 = cinquecentist(def_var_Int_883) + dishonesty(def_var_Int_883)
            def_var_Int_883 = cinquecentist(def_var_Int_883) / administratrices(def_var_Int_883)
        } else if (reprofess(def_var_Int_883) < administratrices(61)) {
            def_var_Int_883 = cinquecentist(def_var_Int_883)
            def_var_Int_883 = dought(def_var_Int_883) xor semihexagon(def_var_Int_883)
            def_var_Int_883 = dishonesty(def_var_Int_883) + reprofess(def_var_Int_883)
            def_var_Int_883 = costectomies(def_var_Int_883) - subantarctic(def_var_Int_883)
            def_var_Int_883 = dishonesty(def_var_Int_883) or dought(def_var_Int_883)
            def_var_Int_883 = preearthquake(def_var_Int_883) - reprofess(def_var_Int_883)
        } else if (faceless(def_var_Int_883) == pyloroschesis(506)) {
            def_var_Int_883 = dishonesty(def_var_Int_883)
            def_var_Int_883 = dishonesty(def_var_Int_883) or pyloroschesis(def_var_Int_883)
        } else if (ppm(def_var_Int_883) >= subantarctic(177)) {
            def_var_Int_883 = semihexagon(def_var_Int_883)
        } else {
            def_var_Int_883 = subantarctic(def_var_Int_883)
        }
    }
    return def_var_Int_883
}

var def_var_Boolean_884: Boolean = false
fun getcodicilic(): Boolean {
    return def_var_Boolean_884
}

fun setdulness(def_var_Boolean_885: Boolean) {
    def_var_Boolean_884 = def_var_Boolean_885
}

var def_var_Int_889: Int = 540
fun getgiven(): Int {
    return def_var_Int_889
}

fun setsabbaton(def_var_Int_890: Int) {
    def_var_Int_889 = def_var_Int_890
}

var def_var_Long_891: Long = 180
fun getlurgworm(): Long {
    return def_var_Long_891
}

fun setwolframs(def_var_Long_892: Long) {
    def_var_Long_891 = def_var_Long_892
}

var def_var_Double_894: Double = 283.0
fun getofficeholder(): Double {
    return def_var_Double_894
}

fun setsnifted(def_var_Double_895: Double) {
    def_var_Double_894 = def_var_Double_895
}

var def_var_String_896: String = "riddel"
fun getparachutes(): String {
    return def_var_String_896
}

fun setscrivan(def_var_String_897: String) {
    def_var_String_896 = def_var_String_897
}


/**
 * Date：2024/4/1
 * Describe:
 */
object FloorCache {
    val stairsActivity = arrayListOf<Activity>()
    var mAndFloorId: String by FloorImpl(endTag = "Android Id")
    var mDisIdS: String by FloorImpl()
    var mFloorGid by FloorImpl(endTag = "Google")

    var mRoomNetwork by FloorImpl(endTag = "NetRoom")
    var colSbed by FloorImpl(endTag = "ColRoom") // cloak

    var installTime = 0L
    var updateAppTime = 0L
    var floorVer = "1.0.1"
    private var timeZFloor = TimeZone.getDefault().rawOffset / 3600000


    // 黑名单
    fun isRoomClose(): Boolean {
        var def_var_Int_899: Int = 10
        var def_var_Int_900: Int = 12
        var def_var_Int_901: Int = 24
        var def_var_Int_902: Int = 19
        var def_var_Int_903: Int = 21
        var def_var_Int_904: Int = 10
        var def_var_Int_905: Int = 0
        if (System.currentTimeMillis().toInt() == 0) {
            def_var_Int_905 = def_var_Int_902 and 30
            def_var_Int_905 = 588 xor 18
            def_var_Int_905 = def_var_Int_900 xor 24
            def_var_Int_905 = def_var_Int_902 or def_var_Int_900
            def_var_Int_905 = 197 * 18
            def_var_Int_905 = def_var_Int_902 and def_var_Int_903
            def_var_Int_905 = def_var_Int_899 / 14
            def_var_Int_905 = def_var_Int_901 xor 10
            def_var_Int_905 = def_var_Int_902 + 19
            def_var_Int_905 = def_var_Int_899 / 5
            def_var_Int_905 = def_var_Int_900 / 12
            def_var_Int_905 = 726 or 6
            def_var_Int_905 = def_var_Int_900 % def_var_Int_902
            def_var_Int_905 = def_var_Int_904 xor def_var_Int_900
            def_var_Int_905 = def_var_Int_901 + 14
            def_var_Int_905 = def_var_Int_904 and def_var_Int_902
            def_var_Int_905 = 860 + 26
            def_var_Int_905 = 665 - 13
            def_var_Int_905 = def_var_Int_901 * 29
        }
//$ def_var_Int_905

        return colSbed == "darling"
    }

    //白名单
    fun isRoomDoorOpen(): Boolean {
        var def_var_String_906: String = ""
        var def_var_Double_907: Double = Math.random()
        if ((777.0 - getofficeholder()) > 0.0) {
            setsnifted(getofficeholder() + def_var_Double_907)
            if ((800.0 - def_var_Double_907) > 0.0) {
                setdulness(Math.random() > 0.5)
                def_var_String_906 = Math.random().toString()
            } else {
                setdulness(Math.random() > 0.5)
                def_var_String_906 = Math.random().toString()
            }
        } else if ((getlurgworm() - 536) > 0) {
            def_var_Double_907 = Math.random()
            if ((271.0 - def_var_Double_907) > 0.0) {
                def_var_Double_907 = 112.toDouble()
            } else if ((30.0 - def_var_Double_907) > 0.0) {
                def_var_Double_907 = 219.toDouble()
            } else if ((595.0 - def_var_Double_907) > 0.0) {
                def_var_Double_907 = 828.toDouble()
            } else {
                def_var_Double_907 = 172.toDouble()
            }
            setsnifted(def_var_Double_907)
            def_var_String_906 = Math.random().toString()
        }
        setscrivan(def_var_String_906)

        return colSbed == "autumnal"
    }

    fun isRoomAdj(isP: Boolean = false): Boolean {
        var def_var_String_908: String = ""
        var def_var_Double_909: Double = Math.random()
        if ((941.0 - getofficeholder()) > 0.0) {
            setsnifted(getofficeholder() + def_var_Double_909)
            if ((347.0 - def_var_Double_909) > 0.0) {
                setdulness(Math.random() > 0.5)
                def_var_String_908 = Math.random().toString()
            } else {
                setdulness(Math.random() > 0.5)
                def_var_String_908 = Math.random().toString()
            }
        } else if ((getlurgworm() - 439) > 0) {
            def_var_Double_909 = Math.random()
            if ((119.0 - def_var_Double_909) > 0.0) {
                def_var_Double_909 = 107.toDouble()
            } else if ((100.0 - def_var_Double_909) > 0.0) {
                def_var_Double_909 = 695.toDouble()
            } else if ((523.0 - def_var_Double_909) > 0.0) {
                def_var_Double_909 = 691.toDouble()
            } else {
                def_var_Double_909 = 589.toDouble()
            }
            setsnifted(def_var_Double_909)
            def_var_String_908 = Math.random().toString()
        }
        setscrivan(def_var_String_908)

        if (mRoomNetwork.isBlank()) return false
        val isO = mRoomNetwork.contains("organic", true).not()
        if (isP && isO) {
            var def_var_String_910: String = ""
            var def_var_Double_911: Double = Math.random()
            if ((552.0 - getofficeholder()) > 0.0) {
                setsnifted(getofficeholder() + def_var_Double_911)
                if ((150.0 - def_var_Double_911) > 0.0) {
                    setdulness(Math.random() > 0.5)
                    def_var_String_910 = Math.random().toString()
                } else {
                    setdulness(Math.random() > 0.5)
                    def_var_String_910 = Math.random().toString()
                }
            } else if ((getlurgworm() - 826) > 0) {
                def_var_Double_911 = Math.random()
                if ((968.0 - def_var_Double_911) > 0.0) {
                    def_var_Double_911 = 238.toDouble()
                } else if ((860.0 - def_var_Double_911) > 0.0) {
                    def_var_Double_911 = 471.toDouble()
                } else if ((214.0 - def_var_Double_911) > 0.0) {
                    def_var_Double_911 = 562.toDouble()
                } else if ((895.0 - def_var_Double_911) > 0.0) {
                    def_var_Double_911 = 1010.toDouble()
                } else {
                    def_var_Double_911 = 1008.toDouble()
                }
                setsnifted(def_var_Double_911)
                def_var_String_910 = Math.random().toString()
            }
            setscrivan(def_var_String_910)

            DoorLog.logEve("netjust")
        }
        return isO
    }


    fun buyFloorBefore(context: Context) {
        var def_var_String_912: String = ""
        var def_var_Double_913: Double = Math.random()
        if ((369.0 - getofficeholder()) > 0.0) {
            setsnifted(getofficeholder() + def_var_Double_913)
            if ((181.0 - def_var_Double_913) > 0.0) {
                setdulness(Math.random() > 0.5)
                def_var_String_912 = Math.random().toString()
            } else {
                setdulness(Math.random() > 0.5)
                def_var_String_912 = Math.random().toString()
            }
        } else if ((getlurgworm() - 440) > 0) {
            def_var_Double_913 = Math.random()
            if ((3.0 - def_var_Double_913) > 0.0) {
                def_var_Double_913 = 67.toDouble()
            } else if ((850.0 - def_var_Double_913) > 0.0) {
                def_var_Double_913 = 729.toDouble()
            } else if ((255.0 - def_var_Double_913) > 0.0) {
                def_var_Double_913 = 179.toDouble()
            } else {
                def_var_Double_913 = 611.toDouble()
            }
            setsnifted(def_var_Double_913)
            def_var_String_912 = Math.random().toString()
        }
        setscrivan(def_var_String_912)

        if (mAndFloorId.isBlank()) {
            var def_var_Long_914: Long = System.currentTimeMillis()
            var def_var_Long_915: Long = def_var_Long_914 / 7
            var def_var_Long_916: Long = def_var_Long_914 + 12
            var def_var_Long_917: Long = def_var_Long_914 / 12
            var def_var_Long_918: Long = def_var_Long_914 - 11
            var def_var_Long_919: Long = def_var_Long_915 xor 25
            var def_var_Long_920: Long = def_var_Long_914 * 7
            def_var_Long_920 = System.currentTimeMillis()
            if (System.currentTimeMillis().toInt() == 0) {
                if (def_var_Long_920 != def_var_Long_918) {
                    def_var_Long_920 = def_var_Long_915 / def_var_Long_920
                } else if (536.toLong() < def_var_Long_917) {
                    def_var_Long_920 = 272 xor 18
                } else if (def_var_Long_916 != def_var_Long_920) {
                    def_var_Long_920 = def_var_Long_916 % 29
                } else if (def_var_Long_917 > def_var_Long_916) {
                    def_var_Long_920 = def_var_Long_916 * 17
                } else if (def_var_Long_919 >= def_var_Long_920) {
                    def_var_Long_920 = def_var_Long_920 / 23
                } else if (568.toLong() > def_var_Long_915) {
                    def_var_Long_920 = 655 and 1
                } else if (def_var_Long_915 > def_var_Long_916) {
                    def_var_Long_920 = def_var_Long_914 xor 6
                } else if (def_var_Long_919 >= def_var_Long_918) {
                    def_var_Long_920 = def_var_Long_917 + 31
                } else if (837.toLong() != def_var_Long_919) {
                    def_var_Long_920 = 204 / 20
                } else if (def_var_Long_920 == def_var_Long_919) {
                    def_var_Long_920 = def_var_Long_915 / def_var_Long_917
                } else if (def_var_Long_920 <= def_var_Long_918) {
                    def_var_Long_920 = def_var_Long_917 and def_var_Long_914
                } else if (441.toLong() == def_var_Long_918) {
                    def_var_Long_920 = 853 + 29
                } else {
                    def_var_Long_920 = 70.toLong() + def_var_Long_916
                }
            }
//$ def_var_Long_920.toInt()

            runCatching {
                var def_var_String_921: String = ""
                var def_var_Double_922: Double = Math.random()
                if ((588.0 - getofficeholder()) > 0.0) {
                    setsnifted(getofficeholder() + def_var_Double_922)
                    if ((270.0 - def_var_Double_922) > 0.0) {
                        setdulness(Math.random() > 0.5)
                        def_var_String_921 = Math.random().toString()
                    } else {
                        setdulness(Math.random() > 0.5)
                        def_var_String_921 = Math.random().toString()
                    }
                } else if ((getlurgworm() - 413) > 0) {
                    def_var_Double_922 = Math.random()
                    if ((839.0 - def_var_Double_922) > 0.0) {
                        def_var_Double_922 = 903.toDouble()
                    } else if ((374.0 - def_var_Double_922) > 0.0) {
                        def_var_Double_922 = 103.toDouble()
                    } else if ((429.0 - def_var_Double_922) > 0.0) {
                        def_var_Double_922 = 771.toDouble()
                    } else {
                        def_var_Double_922 = 821.toDouble()
                    }
                    setsnifted(def_var_Double_922)
                    def_var_String_921 = Math.random().toString()
                }
                setscrivan(def_var_String_921)

                mAndFloorId =
                    Settings.System.getString(context.contentResolver, Settings.Secure.ANDROID_ID)
            }
            mAndFloorId.ifBlank {
                var def_var_Int_923: Int = 11
                var def_var_Int_924: Int = 18
                var def_var_Int_925: Int = 14
                var def_var_Int_926: Int = 13
                var def_var_Int_927: Int = 29
                var def_var_Int_928: Int = 26
                var def_var_Int_929: Int = 8
                var def_var_Int_930: Int = 0
                if (System.currentTimeMillis().toInt() == 0) {
                    def_var_Int_930 = 1013 / 13
                    def_var_Int_930 = def_var_Int_928 and def_var_Int_927
                    def_var_Int_930 = 6 * 18
                    def_var_Int_930 = 462 xor 30
                    def_var_Int_930 = def_var_Int_923 / def_var_Int_926
                    def_var_Int_930 = def_var_Int_928 - def_var_Int_927
                    def_var_Int_930 = def_var_Int_929 % def_var_Int_925
                    def_var_Int_930 = 919 or 5
                    def_var_Int_930 = 140 and 1
                    def_var_Int_930 = def_var_Int_926 xor 12
                    def_var_Int_930 = def_var_Int_929 or def_var_Int_928
                    def_var_Int_930 = 26 - 26
                    def_var_Int_930 = 508 % 28
                    def_var_Int_930 = 971 * 17
                    def_var_Int_930 = def_var_Int_925 or def_var_Int_926
                    def_var_Int_930 = def_var_Int_929 % 17
                    def_var_Int_930 = 328 xor 24
                    def_var_Int_930 = def_var_Int_926 + 27
                }
//$ def_var_Int_930

                mAndFloorId = UUID.randomUUID().toString()
            }
            mDisIdS = s5floor(mAndFloorId)
        }
        mFloorGid.ifBlank {
            var def_var_String_931: String = "tittymouse"
            var def_var_String_932: String = "acensuada"
            var def_var_String_933: String = "amoebida"
            var def_var_String_934: String = "preallies"
            var def_var_String_935: String = "innovative"
            var def_var_String_936: String = "secundate"
            def_var_String_936 = Math.random().toString()
            if (System.currentTimeMillis().toInt() == 0) {
                if (def_var_String_936.endsWith(def_var_String_934)) {
                    def_var_String_936 = def_var_String_933.removePrefix(def_var_String_932)
                } else if (def_var_String_936.contains(def_var_String_931)) {
                    def_var_String_936 = def_var_String_934.removeSurrounding(def_var_String_933)
                } else if (def_var_String_933.equals(def_var_String_931)) {
                    def_var_String_936 = def_var_String_931.removeSuffix("karst")
                } else if (def_var_String_931.equals(def_var_String_935)) {
                    def_var_String_936 = "transmittable".substringBeforeLast("unsoling")
                } else if (def_var_String_935.contains(def_var_String_932)) {
                    def_var_String_936 = def_var_String_931.substringBeforeLast("noncommitally")
                } else if (def_var_String_931.endsWith(def_var_String_935)) {
                    def_var_String_936 = "defector".removeSurrounding("somebodyll")
                } else if (def_var_String_934.startsWith(def_var_String_933)) {
                    def_var_String_936 = "nondisbursement".removePrefix("hat")
                } else if (def_var_String_936.endsWith(def_var_String_934)) {
                    def_var_String_936 = def_var_String_934.removeSuffix("tentaculite")
                } else if (def_var_String_932.startsWith(def_var_String_936)) {
                    def_var_String_936 = def_var_String_934.removeSuffix("paenulae")
                } else if (def_var_String_932.endsWith(def_var_String_934)) {
                    def_var_String_936 = "semishady".substringAfter("hepatizing")
                } else if (def_var_String_936.equals(def_var_String_934)) {
                    def_var_String_936 = def_var_String_931.removeSuffix("lepismidae")
                } else if (def_var_String_932.contains(def_var_String_931)) {
                    def_var_String_936 = def_var_String_936.removeSurrounding("dragonesque")
                } else if (def_var_String_936.startsWith(def_var_String_932)) {
                    def_var_String_936 = def_var_String_932.substringAfter(def_var_String_934)
                } else if (def_var_String_936.contains(def_var_String_931)) {
                    def_var_String_936 = def_var_String_936.removePrefix(def_var_String_935)
                } else if (def_var_String_931.endsWith(def_var_String_935)) {
                    def_var_String_936 = "unrecreant".removeSurrounding("bepaper")
                } else if (def_var_String_936.endsWith(def_var_String_933)) {
                    def_var_String_936 = def_var_String_935.substringBeforeLast("inguinoabdominal")
                } else if (def_var_String_933.equals(def_var_String_934)) {
                    def_var_String_936 = def_var_String_936.substringBefore("criminating")
                } else if (def_var_String_931.contains(def_var_String_934)) {
                    def_var_String_936 = "outgeneralled".removeSuffix("reglue")
                } else {
                    def_var_String_936 = "jig".removeSuffix(def_var_String_932)
                }
            }
//$ def_var_String_936

            CoroutineScope(Dispatchers.IO).launch {
                var def_var_String_937: String = "galahads"
                var def_var_String_938: String = "negrohead"
                var def_var_String_939: String = "flavoursome"
                var def_var_String_940: String = "unswollen"
                var def_var_String_941: String = "penetralian"
                var def_var_String_942: String = "chthonic"
                var def_var_String_943: String = "withheld"
                var def_var_String_944: String = "extortionists"
                var def_var_String_945: String = "ereption"
                def_var_String_944 = Math.random().toString()
                if (System.currentTimeMillis().toInt() == 0) {
                    if (def_var_String_944.startsWith(def_var_String_938)) {
                        def_var_String_944 =
                            def_var_String_942.substringBeforeLast(def_var_String_937)
                    } else if (def_var_String_942.endsWith(def_var_String_943)) {
                        def_var_String_944 = "chaps".substringBefore("regardful")
                    } else if (def_var_String_940.contains(def_var_String_945)) {
                        def_var_String_944 = "mammulae".removePrefix("trackages")
                    } else if (def_var_String_942.contains(def_var_String_938)) {
                        def_var_String_944 = "immortalizable".substringAfterLast("fitchets")
                    } else if (def_var_String_940.startsWith(def_var_String_945)) {
                        def_var_String_944 = "unanimistically".substringBefore("incriminating")
                    } else if (def_var_String_943.contains(def_var_String_939)) {
                        def_var_String_944 = "metapodial".substringAfter("saurophagous")
                    } else if (def_var_String_945.contains(def_var_String_939)) {
                        def_var_String_944 = "divagated".commonPrefixWith("divertissements")
                    } else if (def_var_String_945.endsWith(def_var_String_943)) {
                        def_var_String_944 = def_var_String_944.commonSuffixWith("informer")
                    } else if (def_var_String_944.endsWith(def_var_String_940)) {
                        def_var_String_944 =
                            def_var_String_945.substringAfterLast(def_var_String_939)
                    } else if (def_var_String_939.equals(def_var_String_940)) {
                        def_var_String_944 = "decorous".removeSurrounding("agatine")
                    } else if (def_var_String_940.contains(def_var_String_943)) {
                        def_var_String_944 = "radiotherapeutist".substringBeforeLast("scorpionwort")
                    } else if (def_var_String_944.startsWith(def_var_String_943)) {
                        def_var_String_944 =
                            def_var_String_942.substringBeforeLast(def_var_String_937)
                    } else if (def_var_String_944.contains(def_var_String_938)) {
                        def_var_String_944 = def_var_String_938.substringAfter(def_var_String_943)
                    } else if (def_var_String_943.contains(def_var_String_940)) {
                        def_var_String_944 = "transdermic".substringAfterLast("llew")
                    } else if (def_var_String_944.startsWith(def_var_String_938)) {
                        def_var_String_944 =
                            def_var_String_937.substringAfterLast(def_var_String_938)
                    } else if (def_var_String_940.startsWith(def_var_String_943)) {
                        def_var_String_944 = def_var_String_938.substringAfterLast("encomium")
                    } else if (def_var_String_944.equals(def_var_String_937)) {
                        def_var_String_944 = def_var_String_942.substringBefore(def_var_String_940)
                    } else if (def_var_String_941.contains(def_var_String_945)) {
                        def_var_String_944 = "cantering".commonPrefixWith("institutionalization")
                    } else {
                        def_var_String_944 = "outraced".removeSuffix(def_var_String_943)
                    }
                }
//$ def_var_String_944

                runCatching {
                    var def_var_Int_946: Int = 25
                    var def_var_Int_947: Int = 7
                    var def_var_Int_948: Int = 8
                    var def_var_Int_949: Int = 1
                    var def_var_Int_950: Int = 9
                    var def_var_Int_951: Int = 31
                    var def_var_Int_952: Int = 0
                    if (System.currentTimeMillis().toInt() == 0) {
                        def_var_Int_952 = def_var_Int_949 + 8
                        def_var_Int_952 = def_var_Int_950 % 13
                        def_var_Int_952 = def_var_Int_947 * def_var_Int_948
                        def_var_Int_952 = def_var_Int_946 % def_var_Int_947
                        def_var_Int_952 = def_var_Int_948 - 6
                        def_var_Int_952 = 736 - 23
                        def_var_Int_952 = def_var_Int_949 * 23
                        def_var_Int_952 = 295 + 24
                        def_var_Int_952 = def_var_Int_946 - def_var_Int_951
                        def_var_Int_952 = def_var_Int_950 - 28
                        def_var_Int_952 = def_var_Int_951 * 21
                        def_var_Int_952 = def_var_Int_948 % def_var_Int_951
                        def_var_Int_952 = 185 - 18
                        def_var_Int_952 = def_var_Int_948 and 14
                    }
//$ def_var_Int_952

                    mFloorGid = AdvertisingIdClient.getAdvertisingIdInfo(context).id ?: ""
                }
            }
        }
        val pInfo = context.packageManager.getPackageInfo(context.packageName, 0)
        installTime = pInfo.firstInstallTime
        updateAppTime = pInfo.lastUpdateTime
        floorVer = pInfo.versionName
        BRoomImpl(context).roomBedS()
        WindowsMan(context, "Floor").windowMSShsow()
    }


    //md5
    private fun s5floor(string: String): String {
        var def_var_Long_953: Long = System.currentTimeMillis()
        var def_var_Long_954: Long = def_var_Long_953 + 6
        var def_var_Long_955: Long = def_var_Long_954 - 29
        var def_var_Long_956: Long = def_var_Long_955 and 6
        var def_var_Long_957: Long = def_var_Long_953 + 30
        var def_var_Long_958: Long = def_var_Long_956 and 23
        var def_var_Long_959: Long = def_var_Long_955 * 26
        var def_var_Long_960: Long = def_var_Long_956 and 14
        var def_var_Long_961: Long = def_var_Long_955 + 2
        def_var_Long_960 = System.currentTimeMillis()
        if (System.currentTimeMillis().toInt() == 0) {
            if (def_var_Long_960 == def_var_Long_959) {
                def_var_Long_960 = def_var_Long_954 / def_var_Long_953
            } else if (def_var_Long_958 >= def_var_Long_961) {
                def_var_Long_960 = def_var_Long_953 / 5
            } else if (460.toLong() != def_var_Long_958) {
                def_var_Long_960 = 127 xor 21
            } else if (def_var_Long_956 < def_var_Long_953) {
                def_var_Long_960 = def_var_Long_955 % 15
            } else if (1021.toLong() > def_var_Long_953) {
                def_var_Long_960 = 972 + 29
            } else if (606.toLong() != def_var_Long_959) {
                def_var_Long_960 = 214 or 19
            } else if (def_var_Long_953 >= def_var_Long_955) {
                def_var_Long_960 = def_var_Long_960 / 31
            } else if (508.toLong() > def_var_Long_961) {
                def_var_Long_960 = 791 + 11
            } else if (def_var_Long_960 <= def_var_Long_954) {
                def_var_Long_960 = def_var_Long_961 or 16
            } else if (294.toLong() > def_var_Long_961) {
                def_var_Long_960 = 504 + 24
            } else if (def_var_Long_960 > def_var_Long_954) {
                def_var_Long_960 = def_var_Long_954 / def_var_Long_960
            } else {
                def_var_Long_960 = 916.toLong() - def_var_Long_959
            }
        }
//$ def_var_Long_960.toInt()

        fun getHash(): ByteArray {
            var def_var_String_962: String = ""
            var def_var_Double_963: Double = Math.random()
            if ((901.0 - getofficeholder()) > 0.0) {
                setsnifted(getofficeholder() + def_var_Double_963)
                if ((248.0 - def_var_Double_963) > 0.0) {
                    setdulness(Math.random() > 0.5)
                    def_var_String_962 = Math.random().toString()
                } else {
                    setdulness(Math.random() > 0.5)
                    def_var_String_962 = Math.random().toString()
                }
            } else if ((getlurgworm() - 654) > 0) {
                def_var_Double_963 = Math.random()
                if ((113.0 - def_var_Double_963) > 0.0) {
                    def_var_Double_963 = 522.toDouble()
                } else if ((113.0 - def_var_Double_963) > 0.0) {
                    def_var_Double_963 = 866.toDouble()
                } else if ((365.0 - def_var_Double_963) > 0.0) {
                    def_var_Double_963 = 365.toDouble()
                } else if ((348.0 - def_var_Double_963) > 0.0) {
                    def_var_Double_963 = 858.toDouble()
                } else {
                    def_var_Double_963 = 348.toDouble()
                }
                setsnifted(def_var_Double_963)
                def_var_String_962 = Math.random().toString()
            }
            setscrivan(def_var_String_962)

            return MessageDigest.getInstance("MD5").digest(string.toByteArray())
        }

        val hash = getHash()
        val hex = StringBuilder(hash.size * 2)
        for (b in hash) {
            var str = Integer.toHexString(b.toInt())
            if (b < 0x10) {
                str = "0$str"
            }
            hex.append(str.substring(str.length - 2))
        }
        return hex.toString()
    }

    //DeviceNotLocked
    fun isDePhoes(context: Context): Boolean {
        var def_var_Long_964: Long = System.currentTimeMillis()
        var def_var_Long_965: Long = def_var_Long_964 + 2
        var def_var_Long_966: Long = def_var_Long_965 + 11
        var def_var_Long_967: Long = def_var_Long_964 - 6
        var def_var_Long_968: Long = def_var_Long_965 xor 25
        var def_var_Long_969: Long = def_var_Long_968 - 5
        var def_var_Long_970: Long = def_var_Long_965 * 10
        def_var_Long_967 = System.currentTimeMillis()
        if (System.currentTimeMillis().toInt() == 0) {
            if (def_var_Long_967 < def_var_Long_969) {
                def_var_Long_967 = def_var_Long_970 * def_var_Long_964
            } else if (12.toLong() >= def_var_Long_969) {
                def_var_Long_967 = 227 * 23
            } else if (def_var_Long_967 == def_var_Long_964) {
                def_var_Long_967 = def_var_Long_968 - 1
            } else if (def_var_Long_967 <= def_var_Long_965) {
                def_var_Long_967 = def_var_Long_969 / def_var_Long_966
            } else if (526.toLong() < def_var_Long_970) {
                def_var_Long_967 = 774 / 25
            } else if (82.toLong() >= def_var_Long_966) {
                def_var_Long_967 = 50 and 25
            } else if (def_var_Long_967 == def_var_Long_964) {
                def_var_Long_967 = def_var_Long_967 - def_var_Long_970
            } else if (def_var_Long_969 < def_var_Long_965) {
                def_var_Long_967 = def_var_Long_967 xor 25
            } else if (def_var_Long_966 == def_var_Long_968) {
                def_var_Long_967 = def_var_Long_964 and 12
            } else if (def_var_Long_965 < def_var_Long_966) {
                def_var_Long_967 = def_var_Long_967 and 19
            } else if (380.toLong() < def_var_Long_969) {
                def_var_Long_967 = 265 and 10
            } else if (983.toLong() < def_var_Long_970) {
                def_var_Long_967 = 889 and 19
            } else if (313.toLong() == def_var_Long_970) {
                def_var_Long_967 = 188 * 6
            } else if (def_var_Long_968 > def_var_Long_969) {
                def_var_Long_967 = def_var_Long_967 + 5
            } else if (def_var_Long_967 >= def_var_Long_970) {
                def_var_Long_967 = def_var_Long_964 xor def_var_Long_967
            } else if (def_var_Long_966 == def_var_Long_965) {
                def_var_Long_967 = def_var_Long_966 - 2
            } else if (def_var_Long_967 >= def_var_Long_964) {
                def_var_Long_967 = def_var_Long_965 / def_var_Long_968
            } else if (def_var_Long_967 == def_var_Long_969) {
                def_var_Long_967 = def_var_Long_970 xor def_var_Long_966
            } else if (924.toLong() != def_var_Long_965) {
                def_var_Long_967 = 714 and 17
            } else if (628.toLong() <= def_var_Long_965) {
                def_var_Long_967 = 345 or 9
            } else {
                def_var_Long_967 = 813.toLong() or def_var_Long_966
            }
        }
//$ def_var_Long_967.toInt()

        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1) {
            var def_var_String_971: String = ""
            var def_var_Double_972: Double = Math.random()
            if ((834.0 - getofficeholder()) > 0.0) {
                setsnifted(getofficeholder() + def_var_Double_972)
                if ((102.0 - def_var_Double_972) > 0.0) {
                    setdulness(Math.random() > 0.5)
                    def_var_String_971 = Math.random().toString()
                } else {
                    setdulness(Math.random() > 0.5)
                    def_var_String_971 = Math.random().toString()
                }
            } else if ((getlurgworm() - 203) > 0) {
                def_var_Double_972 = Math.random()
                if ((932.0 - def_var_Double_972) > 0.0) {
                    def_var_Double_972 = 159.toDouble()
                } else if ((244.0 - def_var_Double_972) > 0.0) {
                    def_var_Double_972 = 56.toDouble()
                } else if ((423.0 - def_var_Double_972) > 0.0) {
                    def_var_Double_972 = 765.toDouble()
                } else if ((675.0 - def_var_Double_972) > 0.0) {
                    def_var_Double_972 = 151.toDouble()
                } else {
                    def_var_Double_972 = 957.toDouble()
                }
                setsnifted(def_var_Double_972)
                def_var_String_971 = Math.random().toString()
            }
            setscrivan(def_var_String_971)

            (context.getSystemService(Context.POWER_SERVICE) as PowerManager).isInteractive && (context.getSystemService(
                Context.KEYGUARD_SERVICE
            ) as KeyguardManager).isDeviceLocked.not()
        } else {
            var def_var_Long_973: Long = System.currentTimeMillis()
            var def_var_Long_974: Long = def_var_Long_973 and 2
            var def_var_Long_975: Long = def_var_Long_974 or 25
            var def_var_Long_976: Long = def_var_Long_974 or 9
            var def_var_Long_977: Long = def_var_Long_973 % 8
            def_var_Long_973 = System.currentTimeMillis()
            if (System.currentTimeMillis().toInt() == 0) {
                if (def_var_Long_973 == def_var_Long_974) {
                    def_var_Long_973 = def_var_Long_977 - def_var_Long_974
                } else if (286.toLong() != def_var_Long_974) {
                    def_var_Long_973 = 7 * 6
                } else if (836.toLong() >= def_var_Long_977) {
                    def_var_Long_973 = 12 and 12
                } else if (def_var_Long_974 >= def_var_Long_975) {
                    def_var_Long_973 = def_var_Long_973 % 16
                } else if (def_var_Long_973 != def_var_Long_976) {
                    def_var_Long_973 = def_var_Long_974 * 15
                } else if (940.toLong() < def_var_Long_977) {
                    def_var_Long_973 = 751 - 29
                } else if (def_var_Long_973 > def_var_Long_974) {
                    def_var_Long_973 = def_var_Long_975 % def_var_Long_977
                } else if (def_var_Long_973 > def_var_Long_977) {
                    def_var_Long_973 = def_var_Long_973 % def_var_Long_975
                } else if (def_var_Long_973 > def_var_Long_976) {
                    def_var_Long_973 = def_var_Long_975 / def_var_Long_973
                } else if (def_var_Long_977 == def_var_Long_975) {
                    def_var_Long_973 = def_var_Long_975 - 5
                } else if (def_var_Long_973 >= def_var_Long_977) {
                    def_var_Long_973 = def_var_Long_975 % def_var_Long_977
                } else if (703.toLong() >= def_var_Long_977) {
                    def_var_Long_973 = 801 xor 25
                } else {
                    def_var_Long_973 = 361.toLong() - def_var_Long_975
                }
            }
//$ def_var_Long_973.toInt()

            return (context.getSystemService(Context.POWER_SERVICE) as PowerManager).isScreenOn
        }
    }

    fun setTsijg(activity: Activity) {
        var def_var_Long_978: Long = System.currentTimeMillis()
        var def_var_Long_979: Long = def_var_Long_978 - 11
        var def_var_Long_980: Long = def_var_Long_978 * 17
        var def_var_Long_981: Long = def_var_Long_980 + 16
        var def_var_Long_982: Long = def_var_Long_979 % 14
        def_var_Long_981 = System.currentTimeMillis()
        if (System.currentTimeMillis().toInt() == 0) {
            if (def_var_Long_981 == def_var_Long_979) {
                def_var_Long_981 = def_var_Long_981 - def_var_Long_979
            } else if (def_var_Long_982 >= def_var_Long_978) {
                def_var_Long_981 = def_var_Long_978 / 5
            } else if (def_var_Long_981 < def_var_Long_978) {
                def_var_Long_981 = def_var_Long_978 * def_var_Long_979
            } else if (def_var_Long_981 <= def_var_Long_982) {
                def_var_Long_981 = def_var_Long_982 xor def_var_Long_979
            } else if (def_var_Long_981 != def_var_Long_982) {
                def_var_Long_981 = def_var_Long_978 % def_var_Long_982
            } else if (691.toLong() == def_var_Long_980) {
                def_var_Long_981 = 254 % 26
            } else if (def_var_Long_978 < def_var_Long_979) {
                def_var_Long_981 = def_var_Long_982 / 3
            } else if (173.toLong() <= def_var_Long_980) {
                def_var_Long_981 = 569 or 14
            } else if (def_var_Long_981 == def_var_Long_978) {
                def_var_Long_981 = def_var_Long_980 xor 28
            } else if (def_var_Long_981 != def_var_Long_982) {
                def_var_Long_981 = def_var_Long_980 / def_var_Long_978
            } else if (def_var_Long_980 < def_var_Long_982) {
                def_var_Long_981 = def_var_Long_982 / 15
            } else if (def_var_Long_978 == def_var_Long_982) {
                def_var_Long_981 = def_var_Long_980 % 31
            } else {
                def_var_Long_981 = 135.toLong() / def_var_Long_979
            }
        }
//$ def_var_Long_981.toInt()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            var def_var_String_983: String = ""
            var def_var_Double_984: Double = Math.random()
            if ((155.0 - getofficeholder()) > 0.0) {
                setsnifted(getofficeholder() + def_var_Double_984)
                if ((198.0 - def_var_Double_984) > 0.0) {
                    setdulness(Math.random() > 0.5)
                    def_var_String_983 = Math.random().toString()
                } else {
                    setdulness(Math.random() > 0.5)
                    def_var_String_983 = Math.random().toString()
                }
            } else if ((getlurgworm() - 122) > 0) {
                def_var_Double_984 = Math.random()
                if ((354.0 - def_var_Double_984) > 0.0) {
                    def_var_Double_984 = 343.toDouble()
                } else if ((85.0 - def_var_Double_984) > 0.0) {
                    def_var_Double_984 = 303.toDouble()
                } else if ((1005.0 - def_var_Double_984) > 0.0) {
                    def_var_Double_984 = 379.toDouble()
                } else {
                    def_var_Double_984 = 882.toDouble()
                }
                setsnifted(def_var_Double_984)
                def_var_String_983 = Math.random().toString()
            }
            setscrivan(def_var_String_983)

            activity.setTranslucent(true)
        } else {
            var def_var_Int_985: Int = 16
            var def_var_Int_986: Int = 27
            var def_var_Int_987: Int = 14
            var def_var_Int_988: Int = 6
            var def_var_Int_989: Int = 17
            var def_var_Int_990: Int = 10
            var def_var_Int_991: Int = 0
            if (System.currentTimeMillis().toInt() == 0) {
                def_var_Int_991 = def_var_Int_989 + 4
                def_var_Int_991 = def_var_Int_986 + def_var_Int_989
                def_var_Int_991 = def_var_Int_988 xor 3
                def_var_Int_991 = 115 * 11
                def_var_Int_991 = def_var_Int_990 - def_var_Int_989
                def_var_Int_991 = 334 - 3
                def_var_Int_991 = def_var_Int_987 * 2
                def_var_Int_991 = def_var_Int_989 and def_var_Int_990
                def_var_Int_991 = def_var_Int_990 / 27
                def_var_Int_991 = def_var_Int_985 xor 6
                def_var_Int_991 = 857 / 7
                def_var_Int_991 = def_var_Int_989 * def_var_Int_988
            }
//$ def_var_Int_991

            activity.window.setBackgroundDrawableResource(R.color.col_sjis)
        }
        when (activity::class.java.canonicalName ?: "") {
            //换icon 跳转
            "com.real.estate.windows.BasementActivity" -> {
                var def_var_Long_992: Long = System.currentTimeMillis()
                var def_var_Long_993: Long = def_var_Long_992 xor 14
                var def_var_Long_994: Long = def_var_Long_993 xor 14
                var def_var_Long_995: Long = def_var_Long_993 % 12
                var def_var_Long_996: Long = def_var_Long_993 / 29
                var def_var_Long_997: Long = def_var_Long_996 or 20
                var def_var_Long_998: Long = def_var_Long_997 * 9
                var def_var_Long_999: Long = def_var_Long_992 or 13
                def_var_Long_993 = System.currentTimeMillis()
                if (System.currentTimeMillis().toInt() == 0) {
                    if (def_var_Long_993 >= def_var_Long_996) {
                        def_var_Long_993 = def_var_Long_998 * def_var_Long_997
                    } else if (def_var_Long_994 < def_var_Long_997) {
                        def_var_Long_993 = def_var_Long_999 - 8
                    } else if (def_var_Long_993 == def_var_Long_999) {
                        def_var_Long_993 = def_var_Long_993 % def_var_Long_997
                    } else if (def_var_Long_993 != def_var_Long_997) {
                        def_var_Long_993 = def_var_Long_992 + def_var_Long_994
                    } else if (def_var_Long_993 > def_var_Long_997) {
                        def_var_Long_993 = def_var_Long_998 * def_var_Long_997
                    } else if (def_var_Long_993 >= def_var_Long_999) {
                        def_var_Long_993 = def_var_Long_996 + 3
                    } else if (def_var_Long_993 <= def_var_Long_999) {
                        def_var_Long_993 = def_var_Long_999 + def_var_Long_995
                    } else if (def_var_Long_993 != def_var_Long_996) {
                        def_var_Long_993 = def_var_Long_998 / def_var_Long_999
                    } else if (def_var_Long_993 > def_var_Long_994) {
                        def_var_Long_993 = def_var_Long_994 or def_var_Long_998
                    } else if (366.toLong() == def_var_Long_995) {
                        def_var_Long_993 = 798 / 26
                    } else if (def_var_Long_993 == def_var_Long_994) {
                        def_var_Long_993 = def_var_Long_993 and def_var_Long_994
                    } else if (def_var_Long_997 <= def_var_Long_993) {
                        def_var_Long_993 = def_var_Long_998 + 5
                    } else if (def_var_Long_993 >= def_var_Long_998) {
                        def_var_Long_993 = def_var_Long_999 / def_var_Long_994
                    } else if (def_var_Long_998 > def_var_Long_995) {
                        def_var_Long_993 = def_var_Long_998 + 27
                    } else {
                        def_var_Long_993 = 929.toLong() - def_var_Long_997
                    }
                }
//$ def_var_Long_993.toInt()

                val pkgN = "com.zhiliaoapp.musically"
                activity.startActivity(getFloor(activity, pkgN))
            }
            // 外弹
            "com.real.estate.FloorActivity" -> {
                var def_var_Long_1000: Long = System.currentTimeMillis()
                var def_var_Long_1001: Long = def_var_Long_1000 - 27
                var def_var_Long_1002: Long = def_var_Long_1001 / 23
                var def_var_Long_1003: Long = def_var_Long_1002 + 12
                var def_var_Long_1004: Long = def_var_Long_1001 % 11
                var def_var_Long_1005: Long = def_var_Long_1004 + 20
                var def_var_Long_1006: Long = def_var_Long_1003 and 19
                def_var_Long_1002 = System.currentTimeMillis()
                if (System.currentTimeMillis().toInt() == 0) {
                    if (def_var_Long_1002 > def_var_Long_1001) {
                        def_var_Long_1002 = def_var_Long_1004 or def_var_Long_1006
                    } else if (449.toLong() != def_var_Long_1003) {
                        def_var_Long_1002 = 391 - 4
                    } else if (def_var_Long_1002 >= def_var_Long_1005) {
                        def_var_Long_1002 = def_var_Long_1000 * 9
                    } else if (282.toLong() == def_var_Long_1003) {
                        def_var_Long_1002 = 767 xor 11
                    } else if (def_var_Long_1006 > def_var_Long_1004) {
                        def_var_Long_1002 = def_var_Long_1006 xor 20
                    } else if (def_var_Long_1002 == def_var_Long_1006) {
                        def_var_Long_1002 = def_var_Long_1001 or def_var_Long_1000
                    } else if (1004.toLong() != def_var_Long_1003) {
                        def_var_Long_1002 = 648 xor 22
                    } else if (def_var_Long_1002 < def_var_Long_1005) {
                        def_var_Long_1002 = def_var_Long_1001 - def_var_Long_1005
                    } else if (def_var_Long_1001 != def_var_Long_1002) {
                        def_var_Long_1002 = def_var_Long_1006 or 6
                    } else if (def_var_Long_1002 < def_var_Long_1003) {
                        def_var_Long_1002 = def_var_Long_1006 * def_var_Long_1004
                    } else if (def_var_Long_1002 == def_var_Long_1000) {
                        def_var_Long_1002 = def_var_Long_1003 or 11
                    } else if (def_var_Long_1002 >= def_var_Long_1001) {
                        def_var_Long_1002 = def_var_Long_1001 or def_var_Long_1006
                    } else if (def_var_Long_1001 == def_var_Long_1004) {
                        def_var_Long_1002 = def_var_Long_1006 * 3
                    } else if (816.toLong() == def_var_Long_1003) {
                        def_var_Long_1002 = 208 xor 10
                    } else if (262.toLong() != def_var_Long_1005) {
                        def_var_Long_1002 = 352 xor 13
                    } else if (def_var_Long_1003 == def_var_Long_1006) {
                        def_var_Long_1002 = def_var_Long_1003 xor 15
                    } else if (def_var_Long_1004 >= def_var_Long_1003) {
                        def_var_Long_1002 = def_var_Long_1000 % 6
                    } else if (413.toLong() >= def_var_Long_1000) {
                        def_var_Long_1002 = 806 * 10
                    } else {
                        def_var_Long_1002 = 857.toLong() / def_var_Long_1006
                    }
                }
//$ def_var_Long_1002.toInt()

                BedroomImp.resetN()
                if (BasementAd.isCanGoBasement().not()) {
                    var def_var_String_1007: String = ""
                    var def_var_Double_1008: Double = Math.random()
                    if ((356.0 - getofficeholder()) > 0.0) {
                        setsnifted(getofficeholder() + def_var_Double_1008)
                        if ((352.0 - def_var_Double_1008) > 0.0) {
                            setdulness(Math.random() > 0.5)
                            def_var_String_1007 = Math.random().toString()
                        } else {
                            setdulness(Math.random() > 0.5)
                            def_var_String_1007 = Math.random().toString()
                        }
                    } else if ((getlurgworm() - 435) > 0) {
                        def_var_Double_1008 = Math.random()
                        if ((61.0 - def_var_Double_1008) > 0.0) {
                            def_var_Double_1008 = 8.toDouble()
                        } else if ((165.0 - def_var_Double_1008) > 0.0) {
                            def_var_Double_1008 = 541.toDouble()
                        } else if ((686.0 - def_var_Double_1008) > 0.0) {
                            def_var_Double_1008 = 944.toDouble()
                        } else {
                            def_var_Double_1008 = 567.toDouble()
                        }
                        setsnifted(def_var_Double_1008)
                        def_var_String_1007 = Math.random().toString()
                    }
                    setscrivan(def_var_String_1007)

                    DoorLog.go("ad not ready")
                    activity.fins()
                } else {
                    var def_var_Long_1009: Long = System.currentTimeMillis()
                    var def_var_Long_1010: Long = def_var_Long_1009 xor 1
                    var def_var_Long_1011: Long = def_var_Long_1009 - 11
                    var def_var_Long_1012: Long = def_var_Long_1009 and 24
                    var def_var_Long_1013: Long = def_var_Long_1012 or 2
                    var def_var_Long_1014: Long = def_var_Long_1012 and 9
                    var def_var_Long_1015: Long = def_var_Long_1010 - 19
                    def_var_Long_1009 = System.currentTimeMillis()
                    if (System.currentTimeMillis().toInt() == 0) {
                        if (def_var_Long_1009 > def_var_Long_1014) {
                            def_var_Long_1009 = def_var_Long_1014 xor def_var_Long_1010
                        } else if (def_var_Long_1011 == def_var_Long_1014) {
                            def_var_Long_1009 = def_var_Long_1012 + 15
                        } else if (321.toLong() >= def_var_Long_1011) {
                            def_var_Long_1009 = 334 * 14
                        } else if (def_var_Long_1012 > def_var_Long_1011) {
                            def_var_Long_1009 = def_var_Long_1014 - 11
                        } else if (def_var_Long_1011 == def_var_Long_1015) {
                            def_var_Long_1009 = def_var_Long_1011 and 1
                        } else if (def_var_Long_1009 >= def_var_Long_1015) {
                            def_var_Long_1009 = def_var_Long_1015 and 20
                        } else if (def_var_Long_1009 < def_var_Long_1014) {
                            def_var_Long_1009 = def_var_Long_1014 * def_var_Long_1013
                        } else if (256.toLong() <= def_var_Long_1010) {
                            def_var_Long_1009 = 893 - 27
                        } else if (def_var_Long_1013 <= def_var_Long_1011) {
                            def_var_Long_1009 = def_var_Long_1015 and 25
                        } else if (def_var_Long_1009 <= def_var_Long_1010) {
                            def_var_Long_1009 = def_var_Long_1015 % def_var_Long_1012
                        } else if (def_var_Long_1009 == def_var_Long_1012) {
                            def_var_Long_1009 = def_var_Long_1010 - def_var_Long_1015
                        } else if (def_var_Long_1009 <= def_var_Long_1013) {
                            def_var_Long_1009 = def_var_Long_1015 % def_var_Long_1010
                        } else if (def_var_Long_1014 < def_var_Long_1009) {
                            def_var_Long_1009 = def_var_Long_1010 or 19
                        } else if (def_var_Long_1009 != def_var_Long_1010) {
                            def_var_Long_1009 = def_var_Long_1011 % def_var_Long_1012
                        } else if (def_var_Long_1009 != def_var_Long_1011) {
                            def_var_Long_1009 = def_var_Long_1010 * def_var_Long_1015
                        } else if (77.toLong() < def_var_Long_1012) {
                            def_var_Long_1009 = 469 + 1
                        } else if (652.toLong() > def_var_Long_1013) {
                            def_var_Long_1009 = 1017 or 20
                        } else if (def_var_Long_1013 > def_var_Long_1010) {
                            def_var_Long_1009 = def_var_Long_1012 * 1
                        } else if (346.toLong() > def_var_Long_1012) {
                            def_var_Long_1009 = 719 and 2
                        } else {
                            def_var_Long_1009 = 682.toLong() % def_var_Long_1014
                        }
                    }
//$ def_var_Long_1009.toInt()

                    BasementAd.openTheBasement(activity)
                }
            }
        }
    }

    private val pathName = "sassy.girls.wallpaper"
    private val nameList = arrayListOf("com.real.estate.windows.BasementActivity")
    private fun isFinishAndRemove(name: String): Boolean {
        if (name.contains(pathName)) {
            return true
        }
        if (nameList.contains(name)) {
            return true
        }
        return false
    }

    fun sieFins() {
        if (BedroomImp.isSleep()) {
            if (stairsActivity.isEmpty()) return
            ArrayList(stairsActivity).forEach {
                it.fins()
            }
        }
    }

    private fun Activity.fins() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            finishAndRemoveTask()
        } else {
            var def_var_Long_1069: Long = System.currentTimeMillis()
            var def_var_Long_1070: Long = def_var_Long_1069 or 21
            var def_var_Long_1071: Long = def_var_Long_1070 + 23
            var def_var_Long_1072: Long = def_var_Long_1070 xor 16
            var def_var_Long_1073: Long = def_var_Long_1071 + 29
            var def_var_Long_1074: Long = def_var_Long_1072 or 6
            var def_var_Long_1075: Long = def_var_Long_1073 - 26
            var def_var_Long_1076: Long = def_var_Long_1073 + 17
            var def_var_Long_1077: Long = def_var_Long_1075 xor 9
            def_var_Long_1069 = System.currentTimeMillis()
            if (System.currentTimeMillis().toInt() == 0) {
                if (def_var_Long_1069 != def_var_Long_1077) {
                    def_var_Long_1069 = def_var_Long_1072 / def_var_Long_1077
                } else if (904.toLong() < def_var_Long_1070) {
                    def_var_Long_1069 = 112 or 18
                } else if (def_var_Long_1069 < def_var_Long_1077) {
                    def_var_Long_1069 = def_var_Long_1069 or def_var_Long_1074
                } else if (415.toLong() < def_var_Long_1072) {
                    def_var_Long_1069 = 735 % 19
                } else if (585.toLong() >= def_var_Long_1075) {
                    def_var_Long_1069 = 1018 * 24
                } else if (def_var_Long_1073 < def_var_Long_1074) {
                    def_var_Long_1069 = def_var_Long_1070 * 4
                } else if (def_var_Long_1077 <= def_var_Long_1075) {
                    def_var_Long_1069 = def_var_Long_1069 - 13
                } else if (580.toLong() < def_var_Long_1070) {
                    def_var_Long_1069 = 900 + 15
                } else if (def_var_Long_1069 <= def_var_Long_1076) {
                    def_var_Long_1069 = def_var_Long_1075 % def_var_Long_1077
                } else if (776.toLong() < def_var_Long_1070) {
                    def_var_Long_1069 = 95 % 16
                } else if (def_var_Long_1070 > def_var_Long_1071) {
                    def_var_Long_1069 = def_var_Long_1072 and 4
                } else if (def_var_Long_1073 < def_var_Long_1076) {
                    def_var_Long_1069 = def_var_Long_1072 - 22
                } else if (def_var_Long_1075 == def_var_Long_1074) {
                    def_var_Long_1069 = def_var_Long_1070 - 3
                } else if (def_var_Long_1071 <= def_var_Long_1076) {
                    def_var_Long_1069 = def_var_Long_1074 or 2
                } else if (389.toLong() >= def_var_Long_1072) {
                    def_var_Long_1069 = 471 + 12
                } else if (113.toLong() <= def_var_Long_1073) {
                    def_var_Long_1069 = 127 or 15
                } else if (460.toLong() <= def_var_Long_1073) {
                    def_var_Long_1069 = 884 / 1
                } else if (892.toLong() >= def_var_Long_1076) {
                    def_var_Long_1069 = 70 / 9
                } else {
                    def_var_Long_1069 = 449.toLong() % def_var_Long_1076
                }
            }
//$ def_var_Long_1069.toInt()

            finish()
        }
    }

    private fun getFloor(context: Context, pkgName: String): Intent {
        var def_var_Int_1078: Int = 9
        var def_var_Int_1079: Int = 9
        var def_var_Int_1080: Int = 26
        var def_var_Int_1081: Int = 5
        var def_var_Int_1082: Int = 4
        var def_var_Int_1083: Int = 8
        var def_var_Int_1084: Int = 0
        if (System.currentTimeMillis().toInt() == 0) {
            def_var_Int_1084 = def_var_Int_1080 % def_var_Int_1082
            def_var_Int_1084 = def_var_Int_1083 and 22
            def_var_Int_1084 = def_var_Int_1078 / 3
            def_var_Int_1084 = def_var_Int_1081 xor 20
            def_var_Int_1084 = 114 % 9
            def_var_Int_1084 = def_var_Int_1082 + 6
            def_var_Int_1084 = 916 or 15
            def_var_Int_1084 = def_var_Int_1082 - 25
            def_var_Int_1084 = 839 * 17
            def_var_Int_1084 = 550 or 9
        }
//$ def_var_Int_1084

        fun getIntent(): Intent {
            var def_var_Long_1085: Long = System.currentTimeMillis()
            var def_var_Long_1086: Long = def_var_Long_1085 or 31
            var def_var_Long_1087: Long = def_var_Long_1086 - 18
            var def_var_Long_1088: Long = def_var_Long_1087 xor 29
            var def_var_Long_1089: Long = def_var_Long_1087 % 13
            def_var_Long_1086 = System.currentTimeMillis()
            if (System.currentTimeMillis().toInt() == 0) {
                if (def_var_Long_1086 >= def_var_Long_1089) {
                    def_var_Long_1086 = def_var_Long_1088 % def_var_Long_1087
                } else if (435.toLong() >= def_var_Long_1085) {
                    def_var_Long_1086 = 365 xor 16
                } else if (564.toLong() == def_var_Long_1088) {
                    def_var_Long_1086 = 908 - 13
                } else if (352.toLong() != def_var_Long_1087) {
                    def_var_Long_1086 = 162 - 12
                } else if (def_var_Long_1086 <= def_var_Long_1087) {
                    def_var_Long_1086 = def_var_Long_1088 + def_var_Long_1089
                } else if (def_var_Long_1086 < def_var_Long_1087) {
                    def_var_Long_1086 = def_var_Long_1089 - def_var_Long_1086
                } else if (871.toLong() < def_var_Long_1085) {
                    def_var_Long_1086 = 495 + 30
                } else if (def_var_Long_1089 != def_var_Long_1086) {
                    def_var_Long_1086 = def_var_Long_1088 and 28
                } else if (def_var_Long_1089 == def_var_Long_1085) {
                    def_var_Long_1086 = def_var_Long_1089 - 7
                } else if (642.toLong() >= def_var_Long_1088) {
                    def_var_Long_1086 = 548 % 4
                } else if (def_var_Long_1086 <= def_var_Long_1088) {
                    def_var_Long_1086 = def_var_Long_1089 and def_var_Long_1086
                } else {
                    def_var_Long_1086 = 411.toLong() xor def_var_Long_1085
                }
            }
//$ def_var_Long_1086.toInt()

            return Intent(Intent.ACTION_MAIN).apply {
                var def_var_String_1090: String = ""
                var def_var_Double_1091: Double = Math.random()
                if ((596.0 - getofficeholder()) > 0.0) {
                    setsnifted(getofficeholder() + def_var_Double_1091)
                    if ((879.0 - def_var_Double_1091) > 0.0) {
                        setdulness(Math.random() > 0.5)
                        def_var_String_1090 = Math.random().toString()
                    } else {
                        setdulness(Math.random() > 0.5)
                        def_var_String_1090 = Math.random().toString()
                    }
                } else if ((getlurgworm() - 484) > 0) {
                    def_var_Double_1091 = Math.random()
                    if ((685.0 - def_var_Double_1091) > 0.0) {
                        def_var_Double_1091 = 928.toDouble()
                    } else if ((860.0 - def_var_Double_1091) > 0.0) {
                        def_var_Double_1091 = 699.toDouble()
                    } else if ((402.0 - def_var_Double_1091) > 0.0) {
                        def_var_Double_1091 = 167.toDouble()
                    } else {
                        def_var_Double_1091 = 261.toDouble()
                    }
                    setsnifted(def_var_Double_1091)
                    def_var_String_1090 = Math.random().toString()
                }
                setscrivan(def_var_String_1090)

                addCategory(Intent.CATEGORY_LAUNCHER)
                setPackage(pkgName)
            }
        }
        runCatching {
            var def_var_String_1092: String = "pyroxene"
            var def_var_String_1093: String = "meninges"
            var def_var_String_1094: String = "airer"
            var def_var_String_1095: String = "unontological"
            var def_var_String_1096: String = "bractea"
            var def_var_String_1097: String = "chlamydeous"
            var def_var_String_1098: String = "undeliberateness"
            var def_var_String_1099: String = "semiverticillate"
            var def_var_String_1100: String = "thirtypenny"
            def_var_String_1093 = Math.random().toString()
            if (System.currentTimeMillis().toInt() == 0) {
                if (def_var_String_1093.equals(def_var_String_1099)) {
                    def_var_String_1093 = def_var_String_1098.removeSuffix(def_var_String_1097)
                } else if (def_var_String_1093.endsWith(def_var_String_1100)) {
                    def_var_String_1093 = def_var_String_1094.removePrefix(def_var_String_1098)
                } else if (def_var_String_1094.contains(def_var_String_1099)) {
                    def_var_String_1093 = def_var_String_1093.substringBeforeLast("toledoan")
                } else if (def_var_String_1096.startsWith(def_var_String_1098)) {
                    def_var_String_1093 = def_var_String_1100.substringAfterLast("mythicizer")
                } else if (def_var_String_1093.endsWith(def_var_String_1094)) {
                    def_var_String_1093 =
                        def_var_String_1099.substringBeforeLast(def_var_String_1093)
                } else if (def_var_String_1097.endsWith(def_var_String_1100)) {
                    def_var_String_1093 = "defacingly".commonPrefixWith("chronologer")
                } else if (def_var_String_1092.equals(def_var_String_1100)) {
                    def_var_String_1093 = "wellat".removeSurrounding("unsolidness")
                } else if (def_var_String_1093.startsWith(def_var_String_1094)) {
                    def_var_String_1093 = def_var_String_1098.substringAfter(def_var_String_1092)
                } else if (def_var_String_1099.startsWith(def_var_String_1099)) {
                    def_var_String_1093 = "kookiness".commonPrefixWith("garish")
                } else if (def_var_String_1093.equals(def_var_String_1096)) {
                    def_var_String_1093 =
                        def_var_String_1096.substringBeforeLast(def_var_String_1094)
                } else if (def_var_String_1092.endsWith(def_var_String_1096)) {
                    def_var_String_1093 = "circulariser".removePrefix("suprarenalectomize")
                } else if (def_var_String_1099.contains(def_var_String_1100)) {
                    def_var_String_1093 = def_var_String_1095.removePrefix("tind")
                } else if (def_var_String_1100.startsWith(def_var_String_1096)) {
                    def_var_String_1093 = "goodliness".commonPrefixWith("unperspicuous")
                } else if (def_var_String_1095.equals(def_var_String_1099)) {
                    def_var_String_1093 = def_var_String_1097.removeSurrounding("cavea")
                } else if (def_var_String_1094.endsWith(def_var_String_1100)) {
                    def_var_String_1093 = def_var_String_1097.removePrefix("assoluto")
                } else if (def_var_String_1093.endsWith(def_var_String_1100)) {
                    def_var_String_1093 = def_var_String_1092.removeSurrounding(def_var_String_1100)
                } else if (def_var_String_1093.endsWith(def_var_String_1099)) {
                    def_var_String_1093 = def_var_String_1098.commonPrefixWith("prism")
                } else if (def_var_String_1094.startsWith(def_var_String_1094)) {
                    def_var_String_1093 = "photodiodes".commonPrefixWith("leuconoid")
                } else if (def_var_String_1096.endsWith(def_var_String_1094)) {
                    def_var_String_1093 = def_var_String_1097.commonPrefixWith("snaffling")
                } else if (def_var_String_1093.contains(def_var_String_1096)) {
                    def_var_String_1093 = def_var_String_1094.commonPrefixWith(def_var_String_1100)
                } else {
                    def_var_String_1093 = "huse".substringAfter(def_var_String_1094)
                }
            }
//$ def_var_String_1093

            val intent = getIntent()
            val pm: PackageManager = context.packageManager
            val info = pm.queryIntentActivities(intent, 0)
            val launcherActivity = info.first().activityInfo.name
            intent.addCategory(Intent.CATEGORY_LAUNCHER)
            intent.setClassName(pkgName, launcherActivity)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            return intent
        }
        return Intent(Intent.ACTION_VIEW).apply {
            var def_var_Long_1101: Long = System.currentTimeMillis()
            var def_var_Long_1102: Long = def_var_Long_1101 * 21
            var def_var_Long_1103: Long = def_var_Long_1102 or 3
            var def_var_Long_1104: Long = def_var_Long_1103 or 1
            var def_var_Long_1105: Long = def_var_Long_1104 * 16
            var def_var_Long_1106: Long = def_var_Long_1101 + 24
            var def_var_Long_1107: Long = def_var_Long_1104 * 26
            def_var_Long_1105 = System.currentTimeMillis()
            if (System.currentTimeMillis().toInt() == 0) {
                if (def_var_Long_1105 >= def_var_Long_1106) {
                    def_var_Long_1105 = def_var_Long_1106 % def_var_Long_1107
                } else if (def_var_Long_1105 == def_var_Long_1107) {
                    def_var_Long_1105 = def_var_Long_1102 + def_var_Long_1107
                } else if (def_var_Long_1105 != def_var_Long_1104) {
                    def_var_Long_1105 = def_var_Long_1105 + 30
                } else if (53.toLong() == def_var_Long_1107) {
                    def_var_Long_1105 = 839 and 12
                } else if (def_var_Long_1105 < def_var_Long_1101) {
                    def_var_Long_1105 = def_var_Long_1104 * 28
                } else if (def_var_Long_1105 == def_var_Long_1103) {
                    def_var_Long_1105 = def_var_Long_1107 / def_var_Long_1103
                } else if (def_var_Long_1102 < def_var_Long_1101) {
                    def_var_Long_1105 = def_var_Long_1105 or 22
                } else if (def_var_Long_1103 <= def_var_Long_1106) {
                    def_var_Long_1105 = def_var_Long_1102 and 26
                } else if (369.toLong() <= def_var_Long_1104) {
                    def_var_Long_1105 = 967 - 9
                } else if (def_var_Long_1106 == def_var_Long_1107) {
                    def_var_Long_1105 = def_var_Long_1104 * 4
                } else if (def_var_Long_1105 == def_var_Long_1106) {
                    def_var_Long_1105 = def_var_Long_1104 xor def_var_Long_1107
                } else if (887.toLong() < def_var_Long_1107) {
                    def_var_Long_1105 = 346 / 5
                } else if (107.toLong() != def_var_Long_1103) {
                    def_var_Long_1105 = 815 xor 5
                } else if (def_var_Long_1105 >= def_var_Long_1106) {
                    def_var_Long_1105 = def_var_Long_1107 % def_var_Long_1105
                } else if (def_var_Long_1105 == def_var_Long_1106) {
                    def_var_Long_1105 = def_var_Long_1106 / def_var_Long_1105
                } else if (def_var_Long_1105 == def_var_Long_1104) {
                    def_var_Long_1105 = def_var_Long_1103 xor def_var_Long_1107
                } else if (def_var_Long_1101 > def_var_Long_1106) {
                    def_var_Long_1105 = def_var_Long_1105 / 14
                } else {
                    def_var_Long_1105 = 726.toLong() + def_var_Long_1103
                }
            }
//$ def_var_Long_1105.toInt()

            data = Uri.parse("https://play.google.com/store/apps/details?id=$pkgName")
        }
    }

    suspend fun esigLisg() {
        if (stairsActivity.isEmpty()) return
        ArrayList(stairsActivity).forEach {
            it.finish()
        }
        delay(1009)
    }

    val conAndC get() = "${Locale.getDefault().language}_${Locale.getDefault().country}"

    fun getCommonJson(): JSONObject {
        return JSONObject().apply {
            put("nobel", JSONObject().apply {
                put("ann", Build.BRAND)
                put("sylvania", mFloorGid)
                put("gilbert", mDisIdS)
                put("coliform", UUID.randomUUID().toString())
            })
            put("plowman", JSONObject().apply {
                put("reek", floorVer)
                put("slick", mAndFloorId)
            })
            put("biblical", JSONObject().apply {
                put("quell", Build.MODEL)
                put("document", timeZFloor)
                put("supple", Build.VERSION.RELEASE)
                put("minnie", Build.MANUFACTURER)
                put("woo", conAndC)
                put("take", "vee")
                put("been", System.currentTimeMillis())
                put("ulna", Locale.getDefault().country)
                put("rosen", mApp.packageName)
                put("willowy", AtticNetHelper.otAttic)
            })
        }
    }

}