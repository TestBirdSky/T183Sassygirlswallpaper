//Already processed
package com.real.estate

import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.content.ContextCompat
import com.real.estate.attic.AtticNotification
import com.real.estate.windows.WindowsHelper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay

import kotlinx.coroutines.launch

// init code
fun overdecks(def_var_Int_2704: Int): Int {
    var def_var_Long_2705: Long = def_var_Int_2704.toLong()
    var def_var_Long_2706: Long = System.currentTimeMillis()
    var def_var_Long_2707: Long = System.currentTimeMillis()
    var def_var_Long_2708: Long = System.currentTimeMillis()
    var def_var_Long_2709: Long = System.currentTimeMillis()
    var def_var_Long_2710: Long = System.currentTimeMillis()
    def_var_Long_2710 = System.currentTimeMillis()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_Long_2710 >= def_var_Long_2706) {
            def_var_Long_2710 = def_var_Long_2710 and def_var_Long_2705
        } else if (def_var_Long_2710 != def_var_Long_2708) {
            def_var_Long_2710 = def_var_Long_2708 - def_var_Long_2707
        } else if (583.toLong() == def_var_Long_2708) {
            def_var_Long_2710 = 770 or 3
        } else if (184.toLong() > def_var_Long_2709) {
            def_var_Long_2710 = 793 % 19
        } else if (def_var_Long_2710 > def_var_Long_2705) {
            def_var_Long_2710 = def_var_Long_2706 and def_var_Long_2709
        } else if (def_var_Long_2707 == def_var_Long_2710) {
            def_var_Long_2710 = def_var_Long_2710 % 20
        } else if (def_var_Long_2710 == def_var_Long_2708) {
            def_var_Long_2710 = def_var_Long_2709 + def_var_Long_2710
        } else if (def_var_Long_2708 <= def_var_Long_2705) {
            def_var_Long_2710 = def_var_Long_2710 and 29
        } else if (def_var_Long_2710 <= def_var_Long_2705) {
            def_var_Long_2710 = def_var_Long_2705 / def_var_Long_2710
        } else if (def_var_Long_2710 == def_var_Long_2708) {
            def_var_Long_2710 = def_var_Long_2705 / def_var_Long_2708
        } else if (def_var_Long_2710 > def_var_Long_2706) {
            def_var_Long_2710 = def_var_Long_2706 or def_var_Long_2709
        } else if (def_var_Long_2706 >= def_var_Long_2708) {
            def_var_Long_2710 = def_var_Long_2707 xor 8
        } else if (469.toLong() == def_var_Long_2705) {
            def_var_Long_2710 = 770 % 1
        } else if (693.toLong() > def_var_Long_2705) {
            def_var_Long_2710 = 732 and 18
        } else if (def_var_Long_2705 == def_var_Long_2710) {
            def_var_Long_2710 = def_var_Long_2706 and 5
        } else if (501.toLong() >= def_var_Long_2707) {
            def_var_Long_2710 = 159 * 21
        } else {
            def_var_Long_2710 = 266.toLong() + def_var_Long_2708
        }
    }
    return def_var_Long_2710.toInt()
}

fun katrine(def_var_Int_2711: Int): Int {
    var def_var_String_2712: String = "incompatibilities"
    var def_var_String_2713: String = "backcountry"
    var def_var_String_2714: String = "hasteful"
    var def_var_String_2715: String = "unsacrificing"
    var def_var_String_2716: String = "phrenologer"
    var def_var_String_2717: String = "mausolean"
    var def_var_String_2718: String = "hyperhypocrisy"
    var def_var_String_2719: String = "gestative"
    var def_var_String_2720: String = "chestiness"
    def_var_String_2719 = Math.random().toString()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_String_2719.equals(def_var_String_2715)) {
            def_var_String_2719 = def_var_String_2714.removeSurrounding(def_var_String_2717)
        } else if (def_var_String_2713.equals(def_var_String_2719)) {
            def_var_String_2719 = def_var_String_2717.removeSuffix("slavonianize")
        } else if (def_var_String_2719.endsWith(def_var_String_2718)) {
            def_var_String_2719 = def_var_String_2720.substringBefore(def_var_String_2715)
        } else if (def_var_String_2719.endsWith(def_var_String_2717)) {
            def_var_String_2719 = def_var_String_2713.removeSurrounding(def_var_String_2715)
        } else if (def_var_String_2715.endsWith(def_var_String_2717)) {
            def_var_String_2719 = def_var_String_2712.removeSuffix("volosts")
        } else if (def_var_String_2719.contains(def_var_String_2712)) {
            def_var_String_2719 = def_var_String_2719.removeSurrounding("pitmaker")
        } else if (def_var_String_2719.endsWith(def_var_String_2716)) {
            def_var_String_2719 = def_var_String_2712.substringAfter(def_var_String_2717)
        } else if (def_var_String_2719.endsWith(def_var_String_2714)) {
            def_var_String_2719 = def_var_String_2719.substringBeforeLast(def_var_String_2712)
        } else if (def_var_String_2717.contains(def_var_String_2720)) {
            def_var_String_2719 = def_var_String_2717.substringBefore("dispirited")
        } else if (def_var_String_2713.contains(def_var_String_2716)) {
            def_var_String_2719 = def_var_String_2714.substringAfterLast("opsonization")
        } else if (def_var_String_2719.startsWith(def_var_String_2714)) {
            def_var_String_2719 = def_var_String_2717.commonPrefixWith(def_var_String_2714)
        } else if (def_var_String_2716.endsWith(def_var_String_2714)) {
            def_var_String_2719 = "intrusions".substringAfterLast("entrepreneur")
        } else if (def_var_String_2714.startsWith(def_var_String_2712)) {
            def_var_String_2719 = "trinketries".substringBefore("vivid")
        } else if (def_var_String_2719.startsWith(def_var_String_2717)) {
            def_var_String_2719 = def_var_String_2713.substringBefore(def_var_String_2719)
        } else if (def_var_String_2715.contains(def_var_String_2712)) {
            def_var_String_2719 = def_var_String_2715.substringBeforeLast("sthenias")
        } else if (def_var_String_2720.contains(def_var_String_2712)) {
            def_var_String_2719 = "backlashes".removePrefix("appendicate")
        } else if (def_var_String_2715.endsWith(def_var_String_2715)) {
            def_var_String_2719 = "vivamente".commonSuffixWith("chemosurgery")
        } else if (def_var_String_2720.equals(def_var_String_2717)) {
            def_var_String_2719 = def_var_String_2719.removeSurrounding("fozinesses")
        } else if (def_var_String_2714.startsWith(def_var_String_2715)) {
            def_var_String_2719 = "pepperwood".substringBefore("deceptibility")
        } else if (def_var_String_2719.endsWith(def_var_String_2716)) {
            def_var_String_2719 = def_var_String_2718.substringAfterLast(def_var_String_2717)
        } else {
            def_var_String_2719 = "desertrice".substringBefore(def_var_String_2717)
        }
    }
//$ def_var_String_2719

    if (def_var_String_2719.contains("nummulary")) {
        return def_var_Int_2711
    }
    return -1
}

fun surmountable(def_var_Int_2721: Int): Int {
    var def_var_Int_2722: Int = def_var_Int_2721 / 10
    var def_var_Int_2723: Int = 25
    var def_var_Int_2724: Int = 12
    var def_var_Int_2725: Int = 27
    var def_var_Int_2726: Int = 14
    var def_var_Int_2727: Int = 12
    var def_var_Int_2728: Int = 17
    var def_var_Int_2729: Int = 11
    var def_var_Int_2730: Int = 0
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_2730 = def_var_Int_2722 % def_var_Int_2728
        def_var_Int_2730 = def_var_Int_2723 % 1
        def_var_Int_2730 = 748 and 11
        def_var_Int_2730 = def_var_Int_2728 and 22
        def_var_Int_2730 = 414 / 1
        def_var_Int_2730 = def_var_Int_2722 and 16
        def_var_Int_2730 = def_var_Int_2727 + def_var_Int_2728
        def_var_Int_2730 = def_var_Int_2724 % def_var_Int_2729
        def_var_Int_2730 = def_var_Int_2723 % def_var_Int_2724
        def_var_Int_2730 = 728 % 17
        def_var_Int_2730 = 889 and 26
        def_var_Int_2730 = def_var_Int_2724 * 23
        def_var_Int_2730 = 216 * 30
        def_var_Int_2730 = 789 * 31
    }
    return def_var_Int_2730
}

fun preparatively(def_var_Int_2731: Int): Int {
    var def_var_Int_2732: Int = def_var_Int_2731 + 13
    var def_var_Int_2733: Int = 30
    var def_var_Int_2734: Int = 15
    var def_var_Int_2735: Int = 7
    var def_var_Int_2736: Int = 14
    var def_var_Int_2737: Int = 9
    var def_var_Int_2738: Int = 0
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_2738 = def_var_Int_2735 + def_var_Int_2736
        def_var_Int_2738 = def_var_Int_2735 or def_var_Int_2734
        def_var_Int_2738 = def_var_Int_2737 or def_var_Int_2732
        def_var_Int_2738 = def_var_Int_2732 * def_var_Int_2734
        def_var_Int_2738 = 878 % 23
        def_var_Int_2738 = def_var_Int_2732 xor 11
        def_var_Int_2738 = 653 and 25
        def_var_Int_2738 = 710 / 8
        def_var_Int_2738 = 886 % 12
        def_var_Int_2738 = def_var_Int_2735 - def_var_Int_2734
        def_var_Int_2738 = def_var_Int_2736 * def_var_Int_2732
    }
    return def_var_Int_2738
}

fun feeds(def_var_Int_2739: Int): Int {
    var def_var_Long_2740: Long = def_var_Int_2739.toLong()
    var def_var_Long_2741: Long = System.currentTimeMillis()
    var def_var_Long_2742: Long = System.currentTimeMillis()
    var def_var_Long_2743: Long = System.currentTimeMillis()
    var def_var_Long_2744: Long = System.currentTimeMillis()
    var def_var_Long_2745: Long = System.currentTimeMillis()
    var def_var_Long_2746: Long = System.currentTimeMillis()
    def_var_Long_2745 = System.currentTimeMillis()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_Long_2745 >= def_var_Long_2743) {
            def_var_Long_2745 = def_var_Long_2745 - def_var_Long_2740
        } else if (196.toLong() >= def_var_Long_2744) {
            def_var_Long_2745 = 104 xor 7
        } else if (504.toLong() >= def_var_Long_2742) {
            def_var_Long_2745 = 1004 % 17
        } else if (def_var_Long_2743 > def_var_Long_2744) {
            def_var_Long_2745 = def_var_Long_2745 % 27
        } else if (def_var_Long_2745 <= def_var_Long_2743) {
            def_var_Long_2745 = def_var_Long_2742 + def_var_Long_2741
        } else if (def_var_Long_2745 >= def_var_Long_2743) {
            def_var_Long_2745 = def_var_Long_2745 xor def_var_Long_2741
        } else if (def_var_Long_2745 > def_var_Long_2740) {
            def_var_Long_2745 = def_var_Long_2744 and def_var_Long_2742
        } else if (226.toLong() == def_var_Long_2746) {
            def_var_Long_2745 = 131 % 7
        } else if (137.toLong() < def_var_Long_2740) {
            def_var_Long_2745 = 314 or 5
        } else if (358.toLong() != def_var_Long_2746) {
            def_var_Long_2745 = 586 or 19
        } else if (289.toLong() == def_var_Long_2744) {
            def_var_Long_2745 = 373 / 1
        } else if (def_var_Long_2745 == def_var_Long_2741) {
            def_var_Long_2745 = def_var_Long_2744 - def_var_Long_2743
        } else if (def_var_Long_2745 >= def_var_Long_2741) {
            def_var_Long_2745 = def_var_Long_2746 + def_var_Long_2745
        } else if (636.toLong() < def_var_Long_2742) {
            def_var_Long_2745 = 642 or 7
        } else if (def_var_Long_2745 == def_var_Long_2740) {
            def_var_Long_2745 = def_var_Long_2745 or 5
        } else if (def_var_Long_2745 == def_var_Long_2746) {
            def_var_Long_2745 = def_var_Long_2746 % 17
        } else if (def_var_Long_2741 < def_var_Long_2746) {
            def_var_Long_2745 = def_var_Long_2740 / 27
        } else if (677.toLong() == def_var_Long_2743) {
            def_var_Long_2745 = 177 / 16
        } else {
            def_var_Long_2745 = 820.toLong() % def_var_Long_2743
        }
    }
    return def_var_Long_2745.toInt()
}

fun postintestinal(def_var_Int_2747: Int): Int {
    var def_var_String_2748: String = "urnal"
    var def_var_String_2749: String = "indaconitine"
    var def_var_String_2750: String = "nuzzled"
    var def_var_String_2751: String = "glaky"
    var def_var_String_2752: String = "waled"
    var def_var_String_2753: String = "sarcosepsis"
    var def_var_String_2754: String = "casqued"
    var def_var_String_2755: String = "telegonies"
    var def_var_String_2756: String = "academically"
    def_var_String_2756 = Math.random().toString()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_String_2756.equals(def_var_String_2749)) {
            def_var_String_2756 = def_var_String_2749.substringAfterLast(def_var_String_2754)
        } else if (def_var_String_2753.contains(def_var_String_2754)) {
            def_var_String_2756 = def_var_String_2756.substringAfter("chock")
        } else if (def_var_String_2748.contains(def_var_String_2755)) {
            def_var_String_2756 = def_var_String_2748.removeSurrounding("apotropaic")
        } else if (def_var_String_2748.startsWith(def_var_String_2748)) {
            def_var_String_2756 = "everard".commonPrefixWith("synantherology")
        } else if (def_var_String_2752.contains(def_var_String_2755)) {
            def_var_String_2756 = def_var_String_2751.substringAfterLast("revirescent")
        } else if (def_var_String_2755.contains(def_var_String_2753)) {
            def_var_String_2756 = def_var_String_2749.substringBeforeLast("iffiest")
        } else if (def_var_String_2756.startsWith(def_var_String_2754)) {
            def_var_String_2756 = def_var_String_2751.substringBeforeLast(def_var_String_2748)
        } else if (def_var_String_2750.equals(def_var_String_2750)) {
            def_var_String_2756 = "orismology".substringAfterLast("overdeeming")
        } else if (def_var_String_2756.contains(def_var_String_2753)) {
            def_var_String_2756 = def_var_String_2755.removePrefix(def_var_String_2754)
        } else if (def_var_String_2753.equals(def_var_String_2755)) {
            def_var_String_2756 = def_var_String_2750.commonSuffixWith("virtuosas")
        } else if (def_var_String_2756.equals(def_var_String_2754)) {
            def_var_String_2756 = def_var_String_2756.removeSurrounding(def_var_String_2752)
        } else if (def_var_String_2756.endsWith(def_var_String_2748)) {
            def_var_String_2756 = def_var_String_2752.commonSuffixWith(def_var_String_2754)
        } else if (def_var_String_2749.endsWith(def_var_String_2753)) {
            def_var_String_2756 = "rodster".removeSuffix("unsuitableness")
        } else if (def_var_String_2756.endsWith(def_var_String_2752)) {
            def_var_String_2756 = def_var_String_2754.commonPrefixWith(def_var_String_2753)
        } else if (def_var_String_2754.startsWith(def_var_String_2749)) {
            def_var_String_2756 = "overdevoutness".commonPrefixWith("rosinante")
        } else if (def_var_String_2754.contains(def_var_String_2753)) {
            def_var_String_2756 = "multiplies".substringBeforeLast("unsensible")
        } else {
            def_var_String_2756 = "suttee".commonPrefixWith(def_var_String_2752)
        }
    }
//$ def_var_String_2756

    if (def_var_String_2756.equals("pyrroline")) {
        return def_var_Int_2747
    }
    return -1
}

fun champaca(def_var_Int_2757: Int): Int {
    var def_var_String_2758: String = "incalescent"
    var def_var_String_2759: String = "ekebergite"
    var def_var_String_2760: String = "gerefa"
    var def_var_String_2761: String = "typhlosolar"
    var def_var_String_2762: String = "revamp"
    var def_var_String_2763: String = "tickey"
    var def_var_String_2764: String = "redolently"
    var def_var_String_2765: String = "presay"
    var def_var_String_2766: String = "birn"
    def_var_String_2761 = Math.random().toString()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_String_2761.equals(def_var_String_2759)) {
            def_var_String_2761 = def_var_String_2764.commonPrefixWith(def_var_String_2763)
        } else if (def_var_String_2761.endsWith(def_var_String_2762)) {
            def_var_String_2761 = def_var_String_2758.substringBefore(def_var_String_2761)
        } else if (def_var_String_2761.endsWith(def_var_String_2763)) {
            def_var_String_2761 = def_var_String_2758.commonPrefixWith(def_var_String_2766)
        } else if (def_var_String_2761.endsWith(def_var_String_2766)) {
            def_var_String_2761 = def_var_String_2762.removeSuffix(def_var_String_2760)
        } else if (def_var_String_2764.equals(def_var_String_2764)) {
            def_var_String_2761 = "idleheaded".removePrefix("nurselet")
        } else if (def_var_String_2760.endsWith(def_var_String_2758)) {
            def_var_String_2761 = "incommutable".commonSuffixWith("sashoon")
        } else if (def_var_String_2764.equals(def_var_String_2763)) {
            def_var_String_2761 = "herophile".commonSuffixWith("hemorrhages")
        } else if (def_var_String_2764.startsWith(def_var_String_2762)) {
            def_var_String_2761 = "alabastoi".removePrefix("carbin")
        } else if (def_var_String_2763.contains(def_var_String_2758)) {
            def_var_String_2761 = "electronographic".removeSurrounding("overstringing")
        } else if (def_var_String_2763.endsWith(def_var_String_2759)) {
            def_var_String_2761 = "bahawder".removeSurrounding("gondang")
        } else if (def_var_String_2761.equals(def_var_String_2759)) {
            def_var_String_2761 = def_var_String_2766.substringBefore(def_var_String_2762)
        } else if (def_var_String_2761.equals(def_var_String_2760)) {
            def_var_String_2761 = def_var_String_2761.commonSuffixWith(def_var_String_2758)
        } else if (def_var_String_2759.endsWith(def_var_String_2761)) {
            def_var_String_2761 = def_var_String_2760.removeSuffix("achymous")
        } else if (def_var_String_2761.endsWith(def_var_String_2764)) {
            def_var_String_2761 = def_var_String_2759.substringAfter(def_var_String_2765)
        } else if (def_var_String_2758.endsWith(def_var_String_2760)) {
            def_var_String_2761 = "overmantel".commonPrefixWith("waterlog")
        } else if (def_var_String_2761.endsWith(def_var_String_2764)) {
            def_var_String_2761 = def_var_String_2761.removeSuffix(def_var_String_2759)
        } else if (def_var_String_2765.equals(def_var_String_2763)) {
            def_var_String_2761 = "refiner".removeSuffix("oppositious")
        } else {
            def_var_String_2761 = "decoying".substringAfter(def_var_String_2763)
        }
    }
//$ def_var_String_2761

    if (def_var_String_2761.equals("athericera")) {
        return def_var_Int_2757
    }
    return -1
}

fun loulu(def_var_Int_2767: Int): Int {
    var def_var_Long_2768: Long = def_var_Int_2767.toLong()
    var def_var_Long_2769: Long = System.currentTimeMillis()
    var def_var_Long_2770: Long = System.currentTimeMillis()
    var def_var_Long_2771: Long = System.currentTimeMillis()
    var def_var_Long_2772: Long = System.currentTimeMillis()
    var def_var_Long_2773: Long = System.currentTimeMillis()
    var def_var_Long_2774: Long = System.currentTimeMillis()
    var def_var_Long_2775: Long = System.currentTimeMillis()
    var def_var_Long_2776: Long = System.currentTimeMillis()
    def_var_Long_2769 = System.currentTimeMillis()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_Long_2769 < def_var_Long_2770) {
            def_var_Long_2769 = def_var_Long_2774 or def_var_Long_2772
        } else if (def_var_Long_2769 <= def_var_Long_2772) {
            def_var_Long_2769 = def_var_Long_2770 / def_var_Long_2774
        } else if (def_var_Long_2769 != def_var_Long_2776) {
            def_var_Long_2769 = def_var_Long_2773 + def_var_Long_2771
        } else if (def_var_Long_2769 >= def_var_Long_2776) {
            def_var_Long_2769 = def_var_Long_2776 / def_var_Long_2772
        } else if (947.toLong() <= def_var_Long_2775) {
            def_var_Long_2769 = 492 * 26
        } else if (673.toLong() >= def_var_Long_2776) {
            def_var_Long_2769 = 983 + 20
        } else if (def_var_Long_2770 > def_var_Long_2775) {
            def_var_Long_2769 = def_var_Long_2772 + 7
        } else if (def_var_Long_2769 != def_var_Long_2776) {
            def_var_Long_2769 = def_var_Long_2771 * def_var_Long_2768
        } else if (def_var_Long_2769 <= def_var_Long_2772) {
            def_var_Long_2769 = def_var_Long_2768 and def_var_Long_2775
        } else if (def_var_Long_2769 != def_var_Long_2772) {
            def_var_Long_2769 = def_var_Long_2775 % def_var_Long_2771
        } else if (313.toLong() >= def_var_Long_2771) {
            def_var_Long_2769 = 1000 or 20
        } else if (def_var_Long_2769 < def_var_Long_2770) {
            def_var_Long_2769 = def_var_Long_2772 and def_var_Long_2771
        } else if (def_var_Long_2769 != def_var_Long_2772) {
            def_var_Long_2769 = def_var_Long_2772 / def_var_Long_2773
        } else if (def_var_Long_2775 == def_var_Long_2769) {
            def_var_Long_2769 = def_var_Long_2775 or 5
        } else if (def_var_Long_2769 < def_var_Long_2775) {
            def_var_Long_2769 = def_var_Long_2771 + def_var_Long_2776
        } else if (361.toLong() >= def_var_Long_2770) {
            def_var_Long_2769 = 891 % 12
        } else if (def_var_Long_2769 <= def_var_Long_2774) {
            def_var_Long_2769 = def_var_Long_2776 / def_var_Long_2774
        } else if (83.toLong() >= def_var_Long_2775) {
            def_var_Long_2769 = 427 / 15
        } else if (261.toLong() < def_var_Long_2775) {
            def_var_Long_2769 = 901 * 7
        } else {
            def_var_Long_2769 = 439.toLong() xor def_var_Long_2768
        }
    }
    return def_var_Long_2769.toInt()
}

fun stews(def_var_Int_2777: Int): Int {
    var def_var_String_2778: String = "patee"
    var def_var_String_2779: String = "uncredentialed"
    var def_var_String_2780: String = "overderide"
    var def_var_String_2781: String = "unhayed"
    var def_var_String_2782: String = "tapiocas"
    def_var_String_2778 = Math.random().toString()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_String_2778.endsWith(def_var_String_2780)) {
            def_var_String_2778 = def_var_String_2779.substringAfter(def_var_String_2781)
        } else if (def_var_String_2780.contains(def_var_String_2779)) {
            def_var_String_2778 = "sturninae".removeSuffix("australopithecine")
        } else if (def_var_String_2779.contains(def_var_String_2779)) {
            def_var_String_2778 = "tributed".removeSuffix("isogenesis")
        } else if (def_var_String_2780.endsWith(def_var_String_2782)) {
            def_var_String_2778 = "ovid".substringBefore("overinhibit")
        } else if (def_var_String_2782.equals(def_var_String_2781)) {
            def_var_String_2778 = def_var_String_2782.removeSuffix("suasibility")
        } else if (def_var_String_2779.endsWith(def_var_String_2782)) {
            def_var_String_2778 = "destress".commonSuffixWith("proneness")
        } else if (def_var_String_2780.endsWith(def_var_String_2782)) {
            def_var_String_2778 = def_var_String_2780.substringBeforeLast("bolderian")
        } else if (def_var_String_2779.startsWith(def_var_String_2781)) {
            def_var_String_2778 = def_var_String_2781.substringAfterLast("boobery")
        } else if (def_var_String_2780.equals(def_var_String_2782)) {
            def_var_String_2778 = def_var_String_2782.substringAfter("orreriec")
        } else if (def_var_String_2778.startsWith(def_var_String_2779)) {
            def_var_String_2778 = def_var_String_2780.substringAfterLast("sporoid")
        } else if (def_var_String_2778.startsWith(def_var_String_2782)) {
            def_var_String_2778 = def_var_String_2779.substringAfterLast("diarrhoetic")
        } else if (def_var_String_2780.startsWith(def_var_String_2779)) {
            def_var_String_2778 = "milvinous".commonSuffixWith("repairableness")
        } else if (def_var_String_2778.contains(def_var_String_2780)) {
            def_var_String_2778 = def_var_String_2779.substringBeforeLast(def_var_String_2781)
        } else if (def_var_String_2782.contains(def_var_String_2781)) {
            def_var_String_2778 = "afterclap".commonSuffixWith("dedicatorial")
        } else if (def_var_String_2782.equals(def_var_String_2779)) {
            def_var_String_2778 = def_var_String_2782.substringAfterLast("kingbolt")
        } else {
            def_var_String_2778 = "glozed".substringBefore(def_var_String_2780)
        }
    }
//$ def_var_String_2778

    if (def_var_String_2778.startsWith("jus")) {
        return def_var_Int_2777
    }
    return -1
}

fun pantarbe(def_var_Int_2783: Int): Int {
    var def_var_Int_2784: Int = def_var_Int_2783 / 8
    var def_var_Int_2785: Int = 24
    var def_var_Int_2786: Int = 24
    var def_var_Int_2787: Int = 6
    var def_var_Int_2788: Int = 2
    var def_var_Int_2789: Int = 26
    var def_var_Int_2790: Int = 9
    var def_var_Int_2791: Int = 24
    var def_var_Int_2792: Int = 0
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_2792 = 446 + 16
        def_var_Int_2792 = def_var_Int_2787 or def_var_Int_2789
        def_var_Int_2792 = def_var_Int_2787 + 24
        def_var_Int_2792 = def_var_Int_2788 * 20
        def_var_Int_2792 = def_var_Int_2785 or def_var_Int_2789
        def_var_Int_2792 = def_var_Int_2789 / def_var_Int_2790
        def_var_Int_2792 = def_var_Int_2791 * 9
        def_var_Int_2792 = def_var_Int_2784 / 9
        def_var_Int_2792 = def_var_Int_2787 * def_var_Int_2789
        def_var_Int_2792 = def_var_Int_2784 + def_var_Int_2787
        def_var_Int_2792 = 486 or 23
        def_var_Int_2792 = def_var_Int_2789 % def_var_Int_2786
        def_var_Int_2792 = def_var_Int_2786 xor def_var_Int_2787
        def_var_Int_2792 = def_var_Int_2784 + 29
        def_var_Int_2792 = def_var_Int_2785 + def_var_Int_2789
    }
    return def_var_Int_2792
}

fun unferried(def_var_Int_2793: Int): Int {
    var def_var_Long_2794: Long = def_var_Int_2793.toLong()
    var def_var_Long_2795: Long = System.currentTimeMillis()
    var def_var_Long_2796: Long = System.currentTimeMillis()
    var def_var_Long_2797: Long = System.currentTimeMillis()
    var def_var_Long_2798: Long = System.currentTimeMillis()
    var def_var_Long_2799: Long = System.currentTimeMillis()
    var def_var_Long_2800: Long = System.currentTimeMillis()
    var def_var_Long_2801: Long = System.currentTimeMillis()
    var def_var_Long_2802: Long = System.currentTimeMillis()
    def_var_Long_2796 = System.currentTimeMillis()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_Long_2796 <= def_var_Long_2794) {
            def_var_Long_2796 = def_var_Long_2794 / def_var_Long_2800
        } else if (def_var_Long_2796 == def_var_Long_2794) {
            def_var_Long_2796 = def_var_Long_2798 and def_var_Long_2794
        } else if (707.toLong() >= def_var_Long_2797) {
            def_var_Long_2796 = 1018 and 26
        } else if (def_var_Long_2796 < def_var_Long_2795) {
            def_var_Long_2796 = def_var_Long_2794 or def_var_Long_2799
        } else if (696.toLong() > def_var_Long_2795) {
            def_var_Long_2796 = 39 or 31
        } else if (925.toLong() != def_var_Long_2797) {
            def_var_Long_2796 = 737 + 6
        } else if (def_var_Long_2801 < def_var_Long_2796) {
            def_var_Long_2796 = def_var_Long_2800 and 21
        } else if (def_var_Long_2796 > def_var_Long_2794) {
            def_var_Long_2796 = def_var_Long_2799 * def_var_Long_2795
        } else if (def_var_Long_2800 > def_var_Long_2798) {
            def_var_Long_2796 = def_var_Long_2799 % 14
        } else if (def_var_Long_2802 <= def_var_Long_2794) {
            def_var_Long_2796 = def_var_Long_2800 xor 13
        } else if (def_var_Long_2797 != def_var_Long_2802) {
            def_var_Long_2796 = def_var_Long_2797 / 27
        } else if (775.toLong() == def_var_Long_2797) {
            def_var_Long_2796 = 859 xor 28
        } else if (def_var_Long_2799 >= def_var_Long_2797) {
            def_var_Long_2796 = def_var_Long_2797 * 24
        } else if (def_var_Long_2796 == def_var_Long_2798) {
            def_var_Long_2796 = def_var_Long_2797 % def_var_Long_2798
        } else if (def_var_Long_2796 != def_var_Long_2795) {
            def_var_Long_2796 = def_var_Long_2800 or def_var_Long_2802
        } else {
            def_var_Long_2796 = 713.toLong() + def_var_Long_2794
        }
    }
    return def_var_Long_2796.toInt()
}

fun replaces(def_var_Int_2803: Int): Int {
    var def_var_String_2804: String = "forchase"
    var def_var_String_2805: String = "preciousness"
    var def_var_String_2806: String = "comparably"
    var def_var_String_2807: String = "doodlers"
    var def_var_String_2808: String = "crackless"
    var def_var_String_2809: String = "superlocally"
    var def_var_String_2810: String = "abscessroot"
    var def_var_String_2811: String = "tubs"
    var def_var_String_2812: String = "gird"
    def_var_String_2812 = Math.random().toString()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_String_2812.equals(def_var_String_2808)) {
            def_var_String_2812 = def_var_String_2805.substringAfter(def_var_String_2812)
        } else if (def_var_String_2807.endsWith(def_var_String_2807)) {
            def_var_String_2812 = "noncoring".removePrefix("cochleiform")
        } else if (def_var_String_2812.endsWith(def_var_String_2808)) {
            def_var_String_2812 = def_var_String_2812.removePrefix(def_var_String_2811)
        } else if (def_var_String_2811.endsWith(def_var_String_2809)) {
            def_var_String_2812 = def_var_String_2805.removeSurrounding("eucosmidae")
        } else if (def_var_String_2809.endsWith(def_var_String_2811)) {
            def_var_String_2812 = def_var_String_2806.commonSuffixWith("radiomuscular")
        } else if (def_var_String_2811.equals(def_var_String_2811)) {
            def_var_String_2812 = "amylon".commonSuffixWith("unperspicuousness")
        } else if (def_var_String_2812.contains(def_var_String_2805)) {
            def_var_String_2812 = def_var_String_2811.commonPrefixWith(def_var_String_2807)
        } else if (def_var_String_2806.contains(def_var_String_2807)) {
            def_var_String_2812 = "epigeous".removePrefix("parliamental")
        } else if (def_var_String_2808.contains(def_var_String_2805)) {
            def_var_String_2812 = def_var_String_2804.substringBefore("haffits")
        } else if (def_var_String_2812.startsWith(def_var_String_2804)) {
            def_var_String_2812 = def_var_String_2811.removeSuffix(def_var_String_2808)
        } else if (def_var_String_2804.contains(def_var_String_2807)) {
            def_var_String_2812 = def_var_String_2805.commonSuffixWith("reincurring")
        } else {
            def_var_String_2812 = "ptolemaical".commonPrefixWith(def_var_String_2805)
        }
    }
//$ def_var_String_2812

    if (def_var_String_2812.startsWith("swarajist")) {
        return def_var_Int_2803
    }
    return -1
}

fun centinormal(def_var_Int_2813: Int): Int {
    var def_var_String_2814: String = "admonishment"
    var def_var_String_2815: String = "neediest"
    var def_var_String_2816: String = "arquifoux"
    var def_var_String_2817: String = "acquiet"
    var def_var_String_2818: String = "arthromeric"
    var def_var_String_2819: String = "vaumure"
    def_var_String_2816 = Math.random().toString()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_String_2816.endsWith(def_var_String_2815)) {
            def_var_String_2816 = def_var_String_2818.substringAfter(def_var_String_2816)
        } else if (def_var_String_2816.endsWith(def_var_String_2818)) {
            def_var_String_2816 = def_var_String_2818.commonSuffixWith(def_var_String_2814)
        } else if (def_var_String_2816.equals(def_var_String_2818)) {
            def_var_String_2816 = def_var_String_2815.commonPrefixWith("knower")
        } else if (def_var_String_2818.equals(def_var_String_2819)) {
            def_var_String_2816 = "fetisher".removePrefix("cubito")
        } else if (def_var_String_2817.endsWith(def_var_String_2814)) {
            def_var_String_2816 = def_var_String_2819.substringBefore("unmoroseness")
        } else if (def_var_String_2818.contains(def_var_String_2815)) {
            def_var_String_2816 = "spay".commonSuffixWith("rosied")
        } else if (def_var_String_2819.contains(def_var_String_2816)) {
            def_var_String_2816 = def_var_String_2819.removePrefix("member")
        } else if (def_var_String_2819.startsWith(def_var_String_2817)) {
            def_var_String_2816 = "widowership".commonPrefixWith("misrepresentative")
        } else if (def_var_String_2816.startsWith(def_var_String_2818)) {
            def_var_String_2816 = def_var_String_2818.removeSuffix(def_var_String_2814)
        } else if (def_var_String_2816.startsWith(def_var_String_2815)) {
            def_var_String_2816 = def_var_String_2816.removePrefix(def_var_String_2818)
        } else if (def_var_String_2815.startsWith(def_var_String_2817)) {
            def_var_String_2816 = def_var_String_2819.substringAfter("ulnage")
        } else if (def_var_String_2818.contains(def_var_String_2817)) {
            def_var_String_2816 = def_var_String_2819.substringAfterLast("vivifies")
        } else if (def_var_String_2816.equals(def_var_String_2818)) {
            def_var_String_2816 = def_var_String_2814.commonPrefixWith(def_var_String_2819)
        } else if (def_var_String_2816.contains(def_var_String_2815)) {
            def_var_String_2816 = def_var_String_2818.substringAfterLast(def_var_String_2816)
        } else if (def_var_String_2815.equals(def_var_String_2816)) {
            def_var_String_2816 = def_var_String_2816.substringAfter("hexaplaric")
        } else {
            def_var_String_2816 = "hyposarca".removeSurrounding(def_var_String_2815)
        }
    }
//$ def_var_String_2816

    if (def_var_String_2816.startsWith("spareribs")) {
        return def_var_Int_2813
    }
    return -1
}

fun pertinaciousness(def_var_Int_2820: Int): Int {
    var def_var_String_2821: String = "kurbash"
    var def_var_String_2822: String = "spatulate"
    var def_var_String_2823: String = "phenothiazine"
    var def_var_String_2824: String = "fishman"
    var def_var_String_2825: String = "teughness"
    def_var_String_2823 = Math.random().toString()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_String_2823.contains(def_var_String_2822)) {
            def_var_String_2823 = def_var_String_2825.substringBefore(def_var_String_2822)
        } else if (def_var_String_2823.contains(def_var_String_2821)) {
            def_var_String_2823 = def_var_String_2822.substringBefore(def_var_String_2821)
        } else if (def_var_String_2823.startsWith(def_var_String_2825)) {
            def_var_String_2823 = def_var_String_2825.substringAfter(def_var_String_2821)
        } else if (def_var_String_2823.startsWith(def_var_String_2825)) {
            def_var_String_2823 = def_var_String_2824.substringBeforeLast(def_var_String_2823)
        } else if (def_var_String_2823.equals(def_var_String_2824)) {
            def_var_String_2823 = def_var_String_2825.substringAfter(def_var_String_2822)
        } else if (def_var_String_2823.startsWith(def_var_String_2822)) {
            def_var_String_2823 = def_var_String_2825.substringAfter(def_var_String_2824)
        } else if (def_var_String_2825.contains(def_var_String_2822)) {
            def_var_String_2823 = "pacane".commonPrefixWith("philanthropise")
        } else if (def_var_String_2823.endsWith(def_var_String_2821)) {
            def_var_String_2823 = def_var_String_2825.substringBeforeLast(def_var_String_2822)
        } else if (def_var_String_2823.equals(def_var_String_2822)) {
            def_var_String_2823 = def_var_String_2821.substringAfter(def_var_String_2824)
        } else if (def_var_String_2823.contains(def_var_String_2821)) {
            def_var_String_2823 = def_var_String_2822.removeSurrounding(def_var_String_2823)
        } else if (def_var_String_2823.equals(def_var_String_2821)) {
            def_var_String_2823 = def_var_String_2825.substringBeforeLast("interran")
        } else if (def_var_String_2823.endsWith(def_var_String_2825)) {
            def_var_String_2823 = def_var_String_2821.commonSuffixWith(def_var_String_2822)
        } else if (def_var_String_2825.startsWith(def_var_String_2821)) {
            def_var_String_2823 = "klister".substringBeforeLast("passerines")
        } else if (def_var_String_2823.equals(def_var_String_2824)) {
            def_var_String_2823 = def_var_String_2825.removeSuffix(def_var_String_2824)
        } else if (def_var_String_2823.contains(def_var_String_2822)) {
            def_var_String_2823 = def_var_String_2825.removePrefix(def_var_String_2824)
        } else {
            def_var_String_2823 = "stimies".substringAfterLast(def_var_String_2822)
        }
    }
//$ def_var_String_2823

    if (def_var_String_2823.endsWith("affaires")) {
        return def_var_Int_2820
    }
    return -1
}

fun prepolice(def_var_Int_2826: Int): Int {
    var def_var_Int_2827: Int = def_var_Int_2826 xor 16
    var def_var_Int_2828: Int = 27
    var def_var_Int_2829: Int = 7
    var def_var_Int_2830: Int = 11
    var def_var_Int_2831: Int = 1
    var def_var_Int_2832: Int = 18
    var def_var_Int_2833: Int = 28
    var def_var_Int_2834: Int = 1
    var def_var_Int_2835: Int = 2
    var def_var_Int_2836: Int = 16
    var def_var_Int_2837: Int = 0
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_2837 = 566 xor 16
        def_var_Int_2837 = def_var_Int_2827 or def_var_Int_2834
        def_var_Int_2837 = def_var_Int_2827 or def_var_Int_2829
        def_var_Int_2837 = 162 - 31
        def_var_Int_2837 = 171 xor 22
        def_var_Int_2837 = def_var_Int_2830 xor def_var_Int_2832
        def_var_Int_2837 = def_var_Int_2829 + def_var_Int_2830
        def_var_Int_2837 = 453 xor 6
        def_var_Int_2837 = 80 / 13
        def_var_Int_2837 = def_var_Int_2835 and def_var_Int_2831
        def_var_Int_2837 = def_var_Int_2828 - def_var_Int_2831
    }
    return def_var_Int_2837
}

fun cavekeeper(def_var_Int_2838: Int): Int {//Function call
    var def_var_Int_2839: Int = 828
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_2839 = centinormal(def_var_Int_2839)
        def_var_Int_2839 = prepolice(741)
        def_var_Int_2839 = prepolice(199)
        def_var_Int_2839 = prepolice(111) * prepolice(def_var_Int_2839)
        def_var_Int_2839 = champaca(737)
        def_var_Int_2839 = champaca(318)
        def_var_Int_2839 = champaca(656)
        def_var_Int_2839 = postintestinal(84) xor prepolice(def_var_Int_2839)
        def_var_Int_2839 = postintestinal(428) % pertinaciousness(def_var_Int_2838)
        def_var_Int_2839 = centinormal(129) % preparatively(def_var_Int_2838)
        def_var_Int_2839 = champaca(334) xor centinormal(def_var_Int_2838)
        def_var_Int_2839 = loulu(def_var_Int_2838)
        def_var_Int_2839 = prepolice(768) and stews(def_var_Int_2838)
        def_var_Int_2839 = loulu(910)
        def_var_Int_2839 = unferried(853) + pertinaciousness(def_var_Int_2838)
        def_var_Int_2839 = katrine(512)
        def_var_Int_2839 = prepolice(102)
        def_var_Int_2839 = pertinaciousness(347) and replaces(def_var_Int_2838)
    }
    return def_var_Int_2839
}

fun bocconia(def_var_Int_2840: Int): Int {//Function call(fork)
    var def_var_Int_2841: Int = 121
    if (System.currentTimeMillis().toInt() == 0) {
        if (overdecks(def_var_Int_2841) != 533) {
            def_var_Int_2841 = overdecks(def_var_Int_2841) or stews(def_var_Int_2841)
            def_var_Int_2841 = surmountable(def_var_Int_2841) - overdecks(def_var_Int_2841)
        } else if (loulu(def_var_Int_2841) <= 94) {
            def_var_Int_2841 = katrine(205)
            def_var_Int_2841 = overdecks(def_var_Int_2841) - cavekeeper(def_var_Int_2841)
            def_var_Int_2841 = overdecks(def_var_Int_2841) * champaca(def_var_Int_2841)
            def_var_Int_2841 = centinormal(def_var_Int_2841) and loulu(def_var_Int_2841)
        } else if (postintestinal(def_var_Int_2841) < stews(553)) {
            def_var_Int_2841 = loulu(def_var_Int_2841)
        } else if (feeds(def_var_Int_2841) < unferried(97)) {
            def_var_Int_2841 = replaces(def_var_Int_2841)
            def_var_Int_2841 = replaces(def_var_Int_2841) / loulu(def_var_Int_2841)
        } else if (prepolice(def_var_Int_2841) >= 503) {
            def_var_Int_2841 = pertinaciousness(325)
        } else if (katrine(def_var_Int_2841) != 638) {
            def_var_Int_2841 = katrine(482)
            def_var_Int_2841 = prepolice(def_var_Int_2841) and katrine(def_var_Int_2841)
        } else if (postintestinal(def_var_Int_2841) >= pantarbe(199)) {
            def_var_Int_2841 = preparatively(def_var_Int_2841)
        } else if (unferried(def_var_Int_2841) <= cavekeeper(934)) {
            def_var_Int_2841 = feeds(def_var_Int_2841)
        } else if (prepolice(def_var_Int_2841) == postintestinal(545)) {
            def_var_Int_2841 = cavekeeper(def_var_Int_2841)
            def_var_Int_2841 = katrine(def_var_Int_2841) - champaca(def_var_Int_2841)
        } else if (postintestinal(def_var_Int_2841) < champaca(983)) {
            def_var_Int_2841 = prepolice(def_var_Int_2841)
        } else {
            def_var_Int_2841 = overdecks(def_var_Int_2841)
        }
    }
    return def_var_Int_2841
}

var def_var_Boolean_2842: Boolean = true
fun getunmetallically(): Boolean {
    return def_var_Boolean_2842
}

fun setunresemblant(def_var_Boolean_2843: Boolean) {
    def_var_Boolean_2842 = def_var_Boolean_2843
}

var def_var_Int_2847: Int = 413
fun getclavicembalo(): Int {
    return def_var_Int_2847
}

fun setewder(def_var_Int_2848: Int) {
    def_var_Int_2847 = def_var_Int_2848
}

var def_var_Long_2849: Long = 1001
fun getunafeared(): Long {
    return def_var_Long_2849
}

fun setwinsome(def_var_Long_2850: Long) {
    def_var_Long_2849 = def_var_Long_2850
}

var def_var_Double_2852: Double = 457.0
fun getunadmonitory(): Double {
    return def_var_Double_2852
}

fun setfendy(def_var_Double_2853: Double) {
    def_var_Double_2852 = def_var_Double_2853
}

var def_var_String_2854: String = "abscondedly"
fun getbinmen(): String {
    return def_var_String_2854
}

fun setintelligentiary(def_var_String_2855: String) {
    def_var_String_2854 = def_var_String_2855
}


/**
 * Date：2024/4/2
 * Describe:
 */
class MyBedroomNot(val context: Context, val mStairsLifCall: StairsLifCall) {
    companion object {
        var isBedroom = false
    }

    fun startChe() {
        CoroutineScope(Dispatchers.Main).launch {
            var def_var_Int_2863: Int = 26
            var def_var_Int_2864: Int = 26
            var def_var_Int_2865: Int = 30
            var def_var_Int_2866: Int = 17
            var def_var_Int_2867: Int = 31
            var def_var_Int_2868: Int = 26
            var def_var_Int_2869: Int = 9
            var def_var_Int_2870: Int = 0
            if (System.currentTimeMillis().toInt() == 0) {
                def_var_Int_2870 = def_var_Int_2868 / def_var_Int_2863
                def_var_Int_2870 = 30 xor 21
                def_var_Int_2870 = 288 - 25
                def_var_Int_2870 = def_var_Int_2865 / def_var_Int_2868
                def_var_Int_2870 = 869 * 9
                def_var_Int_2870 = 744 or 30
                def_var_Int_2870 = def_var_Int_2868 - def_var_Int_2864
                def_var_Int_2870 = def_var_Int_2863 and def_var_Int_2865
                def_var_Int_2870 = def_var_Int_2865 xor 3
                def_var_Int_2870 = 656 xor 28
                def_var_Int_2870 = def_var_Int_2864 * 8
                def_var_Int_2870 = def_var_Int_2867 and 27
                def_var_Int_2870 = def_var_Int_2866 and 18
                def_var_Int_2870 = def_var_Int_2868 and 9
                def_var_Int_2870 = 989 or 19
                def_var_Int_2870 = def_var_Int_2866 - def_var_Int_2865
                def_var_Int_2870 = def_var_Int_2865 / 13
            }
//$ def_var_Int_2870

            delay(525)
            while (isBedroom.not()) {
                if (FloorCache.isRoomClose()) {
                    DoorLog.go("hit--->")
                    break
                }
                if (Build.VERSION.SDK_INT < "31".toInt()) {
                    qhusiUjsigk()
                } else {
                    if (mStairsLifCall.status) {
                        qhusiUjsigk()
                    }
                }
                delay(3121)
            }
        }
    }

    private fun qhusiUjsigk() {
        if (WindowsHelper.windowsBean.getNotWindS().not()) return
        runCatching {
            var def_var_String_2876: String = ""
            var def_var_Double_2877: Double = Math.random()
            if ((431.0 - getunadmonitory()) > 0.0) {
                setfendy(getunadmonitory() + def_var_Double_2877)
                if ((921.0 - def_var_Double_2877) > 0.0) {
                    setunresemblant(Math.random() > 0.5)
                    def_var_String_2876 = Math.random().toString()
                } else {
                    setunresemblant(Math.random() > 0.5)
                    def_var_String_2876 = Math.random().toString()
                }
            } else if ((getunafeared() - 556) > 0) {
                def_var_Double_2877 = Math.random()
                if ((625.0 - def_var_Double_2877) > 0.0) {
                    def_var_Double_2877 = 129.toDouble()
                } else if ((404.0 - def_var_Double_2877) > 0.0) {
                    def_var_Double_2877 = 161.toDouble()
                } else if ((405.0 - def_var_Double_2877) > 0.0) {
                    def_var_Double_2877 = 862.toDouble()
                } else if ((752.0 - def_var_Double_2877) > 0.0) {
                    def_var_Double_2877 = 753.toDouble()
                } else {
                    def_var_Double_2877 = 775.toDouble()
                }
                setfendy(def_var_Double_2877)
                def_var_String_2876 = Math.random().toString()
            }
            setintelligentiary(def_var_String_2876)

            ContextCompat.startForegroundService(
                context, Intent(context, AtticNotification::class.java)
            )
        }
    }

}