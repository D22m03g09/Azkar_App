package com.azkary.app.data.local

import com.azkary.app.data.model.AzkarCategory
import com.azkary.app.data.model.Zikr

object AzkarData {
    val categories = listOf(
        AzkarCategory(1, "Morning Adhkar", "أذكار الصباح", "Adhkar to be recited in the morning"),
        AzkarCategory(2, "Evening Adhkar", "أذكار المساء", "Adhkar to be recited in the evening"),
        AzkarCategory(3, "After Prayer", "أدبار الصلوات", "Adhkar after obligatory prayers"),
        AzkarCategory(4, "Before Sleep", "أذكار النوم", "Adhkar before going to sleep"),
        AzkarCategory(5, "Waking Up", "أذكار الاستيقاظ", "Adhkar when waking up"),
        AzkarCategory(6, "Entering Mosque", "دعاء دخول المسجد", "Dua when entering the mosque"),
        AzkarCategory(7, "Leaving Mosque", "دعاء خروج المسجد", "Dua when leaving the mosque"),
        AzkarCategory(8, "Before Eating", "دعاء قبل الأكل", "Dua before eating"),
        AzkarCategory(9, "After Eating", "دعاء بعد الأكل", "Dua after eating"),
        AzkarCategory(10, "For Parents", "دعاء للوالدين", "Dua for parents"),
        AzkarCategory(11, "Distress", "دعاء الكرب", "Dua in times of distress"),
        AzkarCategory(12, "Forgiveness", "دعاء المغفرة", "Dua for forgiveness")
    )

    val zikrs = listOf(
        // Morning Adhkar (Category 1)
        Zikr(1, 1, 
            "اللّهُ لاَ إِلَـهَ إِلاَّ هُوَ الْحَيُّ الْقَيُّومُ لاَ تَأْخُذُهُ سِنَةٌ وَلاَ نَوْمٌ لَهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الأَرْضِ مَنْ ذَا الَّذِي يَشْفَعُ عِنْدَهُ إِلاَّ بِإِذْنِهِ يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ وَلاَ يُحِيطُونَ بِشَيْءٍ مِنْ عِلْمِهِ إِلاَّ بِمَا شَاءَ وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَالأَرْضَ وَلاَ يَؤُودُهُ حِفْظُهُمَا وَهُوَ الْعَلِيُّ الْعَظِيمُ",
            "Allahu la ilaha illa Huwal-Hayyul-Qayyum, la ta'khudhuhu sinatun wa la nawm, lahu ma fis-samawati wa ma fil-ard, man dhal-ladhi yashfa'u 'indahu illa bi-idhnih, ya'lamu ma bayna aydihim wa ma khalfahum, wa la yuhituna bi shay'im-min 'ilmihi illa bima sha', wasi'a kursiyyuhus-samawati wal-ard, wa la ya'uduhu hifzuhuma, wa Huwal-'Aliyyul-'Azim.",
            "Allah - there is no deity except Him, the Ever-Living, the Sustainer of existence. Neither drowsiness overtakes Him nor sleep. To Him belongs whatever is in the heavens and whatever is on the earth. Who is it that can intercede with Him except by His permission? He knows what is before them and what will be after them, and they encompass not a thing of His knowledge except for what He wills. His Kursi extends over the heavens and the earth, and their preservation tires Him not. And He is the Most High, the Most Great.",
            "Surah Al-Baqarah 2:255", 1),
        
        Zikr(2, 1,
            "قُلْ هُوَ اللَّهُ أَحَدٌ، اللَّهُ الصَّمَدُ، لَمْ يَلِدْ وَلَمْ يُولَدْ، وَلَمْ يَكُنْ لَهُ كُفُوًا أَحَدٌ",
            "Qul huwallahu Ahad, Allahus-Samad, lam yalid wa lam yulad, wa lam yakul-lahu kufuwan ahad.",
            "Say: He is Allah, the One. Allah, the Eternal Refuge. He neither begets nor is born, Nor is there to Him any equivalent.",
            "Surah Al-Ikhlas", 3),
        
        Zikr(3, 1,
            "قُلْ أَعُوذُ بِرَبِّ الْفَلَقِ، مِن شَرِّ مَا خَلَقَ، وَمِن شَرِّ غَاسِقٍ إِذَا وَقَبَ، وَمِن شَرِّ النَّفَّاثَاتِ فِي الْعُقَدِ، وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدَ",
            "Qul a'udhu birabbil-falaq, min sharri ma khalaq, wa min sharri ghasiqin idha waqab, wa min sharrin-naffathati fil-'uqad, wa min sharri hasidin idha hasad.",
            "Say: I seek refuge in the Lord of daybreak, From the evil of that which He created, And from the evil of darkness when it settles, And from the evil of the blowers in knots, And from the evil of an envier when he envies.",
            "Surah Al-Falaq", 3),
        
        Zikr(4, 1,
            "قُلْ أَعُوذُ بِرَبِّ النَّاسِ، مَلِكِ النَّاسِ، إِلَهِ النَّاسِ، مِن شَرِّ الْوَسْوَاسِ الْخَنَّاسِ، الَّذِي يُوَسْوِسُ فِي صُدُورِ النَّاسِ، مِنَ الْجِنَّةِ وَالنَّاسِ",
            "Qul a'udhu birabin-nas, Malikin-nas, Ilahin-nas, min sharril-waswasil-khannas, alladhi yuwaswisu fi sudurin-nas, minal-jinnati wan-nas.",
            "Say: I seek refuge in the Lord of mankind, The Sovereign of mankind, The God of mankind, From the evil of the retreating whisperer, Who whispers [evil] into the breasts of mankind, From among the jinn and mankind.",
            "Surah An-Nas", 3),
        
        Zikr(5, 1,
            "أَصْـبَحْنا وَأَصْـبَحَ المُـلْكُ لله وَالحَمدُ لله ، لا إلهَ إلاّ اللّهُ وَحدَهُ لا شَريكَ لَه ، لهُ المُـلْكُ ولهُ الحَمْـد، وهُوَ على كلّ شَيءٍ قدير",
            "Asbahna wa asbahal-mulku lillah, walhamdu lillah, la ilaha illallah wahdahu la sharika lah, lahul-mulku wa lahul-hamd, wa Huwa 'ala kulli shay'in Qadir.",
            "We have reached the morning and at this very time the whole kingdom belongs to Allah, and all praise is for Allah. There is none worthy of worship but Allah, the Alone, He has no partner. To Him belongs the kingdom and to Him is all praise, and He is Able to do all things.",
            "Hisn al-Muslim", 1),
        
        Zikr(6, 1,
            "اللّهُمَّ بِكَ أَصْـبَحْنا وَبِكَ أَمْسَـينا ، وَبِكَ نَحْـيا وَبِكَ نَمُـوتُ وَإِلَـيْكَ النُّـشُور",
            "Allahumma bika asbahna wa bika amsayna, wa bika nahya wa bika namutu wa ilaykan-nushur.",
            "O Allah, by You we enter the morning and by You we enter the evening, by You we live and by You we die, and to You is the Final Return.",
            "At-Tirmidhi", 1),
        
        // Evening Adhkar (Category 2)
        Zikr(7, 2,
            "اللّهُ لاَ إِلَـهَ إِلاَّ هُوَ الْحَيُّ الْقَيُّومُ لاَ تَأْخُذُهُ سِنَةٌ وَلاَ نَوْمٌ لَهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الأَرْضِ مَنْ ذَا الَّذِي يَشْفَعُ عِنْدَهُ إِلاَّ بِإِذْنِهِ يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ وَلاَ يُحِيطُونَ بِشَيْءٍ مِنْ عِلْمِهِ إِلاَّ بِمَا شَاءَ وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَالأَرْضَ وَلاَ يَؤُودُهُ حِفْظُهُمَا وَهُوَ الْعَلِيُّ الْعَظِيمُ",
            "Allahu la ilaha illa Huwal-Hayyul-Qayyum, la ta'khudhuhu sinatun wa la nawm, lahu ma fis-samawati wa ma fil-ard, man dhal-ladhi yashfa'u 'indahu illa bi-idhnih, ya'lamu ma bayna aydihim wa ma khalfahum, wa la yuhituna bi shay'im-min 'ilmihi illa bima sha', wasi'a kursiyyuhus-samawati wal-ard, wa la ya'uduhu hifzuhuma, wa Huwal-'Aliyyul-'Azim.",
            "Allah - there is no deity except Him, the Ever-Living, the Sustainer of existence. Neither drowsiness overtakes Him nor sleep. To Him belongs whatever is in the heavens and whatever is on the earth. Who is it that can intercede with Him except by His permission? He knows what is before them and what will be after them, and they encompass not a thing of His knowledge except for what He wills. His Kursi extends over the heavens and the earth, and their preservation tires Him not. And He is the Most High, the Most Great.",
            "Surah Al-Baqarah 2:255", 1),
        
        Zikr(8, 2,
            "قُلْ هُوَ اللَّهُ أَحَدٌ، اللَّهُ الصَّمَدُ، لَمْ يَلِدْ وَلَمْ يُولَدْ، وَلَمْ يَكُنْ لَهُ كُفُوًا أَحَدٌ",
            "Qul huwallahu Ahad, Allahus-Samad, lam yalid wa lam yulad, wa lam yakul-lahu kufuwan ahad.",
            "Say: He is Allah, the One. Allah, the Eternal Refuge. He neither begets nor is born, Nor is there to Him any equivalent.",
            "Surah Al-Ikhlas", 3),
        
        Zikr(9, 2,
            "أَمْسَيْـنا وَأَمْسـى المـلكُ لله وَالحَمدُ لله ، لا إلهَ إلاّ اللّهُ وَحدَهُ لا شَريكَ لَه ، لهُ المُـلْكُ ولهُ الحَمْـد، وهُوَ على كلّ شَيءٍ قدير",
            "Amsayna wa amsal-mulku lillah, walhamdu lillah, la ilaha illallah wahdahu la sharika lah, lahul-mulku wa lahul-hamd, wa Huwa 'ala kulli shay'in Qadir.",
            "We have reached the evening and at this very time the whole kingdom belongs to Allah, and all praise is for Allah. There is none worthy of worship but Allah, the Alone, He has no partner. To Him belongs the kingdom and to Him is all praise, and He is Able to do all things.",
            "Hisn al-Muslim", 1),
        
        // After Prayer (Category 3)
        Zikr(10, 3,
            "أَسْتَغْفِرُ اللَّهَ",
            "Astaghfirullah",
            "I seek forgiveness from Allah",
            "Sahih Muslim", 3),
        
        Zikr(11, 3,
            "اللَّهُمَّ أَنْتَ السَّلَامُ وَمِنْكَ السَّلَامُ تَبَارَكْتَ يَا ذَا الْجَلَالِ وَالْإِكْرَامِ",
            "Allahumma Antas-Salam wa minkas-salam, tabarakta ya Dhal-Jalali wal-Ikram.",
            "O Allah, You are As-Salam (the One free from all defects), and from You is all peace, blessed are You, O Possessor of majesty and honor.",
            "Sahih Muslim", 1),
        
        Zikr(12, 3,
            "لا إِلَهَ إِلَّا اللَّهُ وَحْدَهُ لَا شَرِيكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيرٌ، اللَّهُمَّ لَا مَانِعَ لِمَا أَعْطَيْتَ، وَلَا مُعْطِيَ لِمَا مَنَعْتَ، وَلَا يَنْفَعُ ذَا الْجَدِّ مِنْكَ الْجَدُّ",
            "La ilaha illallah wahdahu la sharika lah, lahul-mulku wa lahul-hamd, wa Huwa 'ala kulli shay'in Qadir. Allahumma la mani'a lima a'tayt, wa la mu'tiya lima mana't, wa la yanfa'u dhal-jaddi minkal-jadd.",
            "There is none worthy of worship but Allah alone, He has no partner, His is the dominion and His is the praise, and He is Able to do all things. O Allah, there is none who can withhold what You give, and none may give what You have withheld; and the might of the mighty person cannot benefit him against You.",
            "Sahih Al-Bukhari", 1),
        
        // Before Sleep (Category 4)
        Zikr(13, 4,
            "بِاسْمِكَ رَبِّـي وَضَعْـتُ جَنْـبي ، وَبِكَ أَرْفَعُـه، فَإِن أَمْسَـكْتَ نَفْسـي فارْحَـمْها ، وَإِنْ أَرْسَلْتَـها فاحْفَظْـها بِمـا تَحْفَـظُ بِهِ عِبـادَكَ الصّـالِحـين",
            "Bismika Rabbi wada'tu janbi, wa bika arfa'uh, fa in amsakta nafsi farhamha, wa in arsaltaha fahfazha bima tahfazu bihi 'ibadakas-salihin.",
            "In Your name, my Lord, I lay down my side, and by You I raise it. If You take my soul, have mercy on it, and if You return it, protect it with that by which You protect Your righteous servants.",
            "Sahih Al-Bukhari", 1),
        
        Zikr(14, 4,
            "اللَّهُمَّ أَسْلَمْتُ نَفْسِي إِلَيْكَ، وَفَوَّضْتُ أَمْرِي إِلَيْكَ، وَأَلْجَأْتُ ظَهْرِي إِلَيْكَ، رَغْبَةً وَرَهْبَةً إِلَيْكَ، لَا مَلْجَأَ وَلَا مَنْجَا مِنْكَ إِلَّا إِلَيْكَ، آمَنْتُ بِكِتَابِكَ الَّذِي أَنْزَلْتَ، وَبِنَبِيِّكَ الَّذِي أَرْسَلْتَ",
            "Allahumma aslamtu nafsi ilayk, wa fawwadtu amri ilayk, wa alja'tu zahri ilayk, raghbatan wa rahbatan ilayk, la malja'a wa la manja minka illa ilayk, amantu bikitabikal-ladhi anzalt, wa binabiyyikal-ladhi arsalt.",
            "O Allah! I surrender my soul to You, and entrust my affairs to You, and depend on You for protection, out of desire for and fear of You. There is no place of safety and no escape from You except to You. I believe in Your Book which You revealed and in Your Prophet whom You sent.",
            "Sahih Al-Bukhari", 1),
        
        Zikr(15, 4,
            "سُبْحَانَ اللَّهِ",
            "Subhanallah",
            "Glory be to Allah",
            "Sahih Al-Bukhari", 33),
        
        Zikr(16, 4,
            "الْحَمْدُ لِلَّهِ",
            "Alhamdulillah",
            "All praise is due to Allah",
            "Sahih Al-Bukhari", 33),
        
        Zikr(17, 4,
            "اللَّهُ أَكْبَرُ",
            "Allahu Akbar",
            "Allah is the Greatest",
            "Sahih Al-Bukhari", 34),
        
        // Waking Up (Category 5)
        Zikr(18, 5,
            "الْحَمْدُ لِلَّهِ الَّذِي أَحْيَانَا بَعْدَ مَا أَمَاتَنَا وَإِلَيْهِ النُّشُورُ",
            "Alhamdu lillahil-ladhi ahyana ba'da ma amatana wa ilayhin-nushur.",
            "All praise is for Allah who gave us life after having given us death and unto Him is the resurrection.",
            "Sahih Al-Bukhari", 1),
        
        // Entering Mosque (Category 6)
        Zikr(19, 6,
            "اللَّهُمَّ افْتَحْ لِي أَبْوَابَ رَحْمَتِكَ",
            "Allahummaftah li abwaba rahmatik.",
            "O Allah, open for me the doors of Your mercy.",
            "Sahih Muslim", 1),
        
        // Leaving Mosque (Category 7)
        Zikr(20, 7,
            "اللَّهُمَّ إِنِّي أَسْأَلُكَ مِنْ فَضْلِكَ",
            "Allahumma inni as'aluka min fadlik.",
            "O Allah, I ask You from Your bounty.",
            "Sahih Muslim", 1),
        
        // Before Eating (Category 8)
        Zikr(21, 8,
            "بِسْمِ اللَّهِ",
            "Bismillah",
            "In the name of Allah",
            "Sunan Abi Dawud", 1),
        
        Zikr(22, 8,
            "بِسْمِ اللَّهِ وَعَلَى بَرَكَةِ اللَّهِ",
            "Bismillahi wa 'ala barakatillah.",
            "In the name of Allah and with the blessings of Allah.",
            "Sahih Muslim", 1),
        
        // After Eating (Category 9)
        Zikr(23, 9,
            "الْحَمْدُ لِلَّهِ الَّذِي أَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مِنَ الْمُسْلِمِينَ",
            "Alhamdu lillahil-ladhi at'amana wa saqana wa ja'alana minal-muslimin.",
            "All praise is for Allah who fed us and gave us drink and made us Muslims.",
            "Sunan Ibn Majah", 1),
        
        // For Parents (Category 10)
        Zikr(24, 10,
            "رَبِّ اغْفِرْ لِي وَلِوَالِدَيَّ وَارْحَمْهُمَا كَمَا رَبَّيَانِي صَغِيرًا",
            "Rabbighfir li waliwalidayya warhamhuma kama rabbayani saghira.",
            "My Lord, forgive me and my parents and have mercy upon them as they brought me up [when I was] small.",
            "Surah Al-Isra 17:24", 1),
        
        // Distress (Category 11)
        Zikr(25, 11,
            "لَا إِلَهَ إِلَّا أَنْتَ سُبْحَانَكَ إِنِّي كُنْتُ مِنَ الظَّالِمِينَ",
            "La ilaha illa anta subhanaka inni kuntu minaz-zalimin.",
            "There is no deity except You; exalted are You. Indeed, I have been of the wrongdoers.",
            "Surah Al-Anbiya 21:87", 1),
        
        Zikr(26, 11,
            "اللَّهُمَّ رَحْمَتَكَ أَرْجُو فَلَا تَكِلْنِي إِلَى نَفْسِي طَرْفَةَ عَيْنٍ، أَصْلِحْ لِي شَأْنِي كُلَّهُ لَا إِلَهَ إِلَّا أَنْتَ",
            "Allahumma rahmataka arju fala takilni ila nafsi tarfata 'ayn, aslih li sha'ni kullahu la ilaha illa ant.",
            "O Allah, I hope for Your mercy, so do not leave me to myself even for the blink of an eye. Rectify all of my affairs, there is no deity except You.",
            "Abu Dawud", 1),
        
        // Forgiveness (Category 12)
        Zikr(27, 12,
            "أَسْتَغْفِرُ اللَّهَ وَأَتُوبُ إِلَيْهِ",
            "Astaghfirullaha wa atubu ilayh.",
            "I seek forgiveness from Allah and repent to Him.",
            "Sahih Al-Bukhari", 100),
        
        Zikr(28, 12,
            "اللَّهُمَّ أَنْتَ رَبِّي لَا إِلَهَ إِلَّا أَنْتَ، خَلَقْتَنِي وَأَنَا عَبْدُكَ، وَأَنَا عَلَى عَهْدِكَ وَوَعْدِكَ مَا اسْتَطَعْتُ، أَعُوذُ بِكَ مِنْ شَرِّ مَا صَنَعْتُ، أَبُوءُ لَكَ بِنِعْمَتِكَ عَلَيَّ، وَأَبُوءُ بِذَنْبِي فَاغْفِرْ لِي فَإِنَّهُ لَا يَغْفِرُ الذُّنُوبَ إِلَّا أَنْتَ",
            "Allahumma Anta Rabbi la ilaha illa Ant, khalaqtani wa ana 'abduk, wa ana 'ala 'ahdika wa wa'dika mastata'tu, a'udhu bika min sharri ma sana'tu, abu'u laka bini'matika 'alayya, wa abu'u bidhanbi faghfir li fa innahu la yaghfirudh-dhunuba illa Ant.",
            "O Allah, You are my Lord, there is no deity except You. You created me and I am Your servant, and I am faithful to my covenant and my promise as far as I am able. I seek refuge in You from the evil of what I have done. I acknowledge before You Your favors upon me, and I acknowledge my sins. So forgive me, for indeed no one forgives sins except You.",
            "Sahih Al-Bukhari", 1)
    )

    fun getZikrsByCategoryId(categoryId: Int): List<Zikr> {
        return zikrs.filter { it.categoryId == categoryId }
    }
}
