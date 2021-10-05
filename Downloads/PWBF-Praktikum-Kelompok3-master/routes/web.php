<?php

use Illuminate\Support\Facades\Route;

Route::get('/home', function () {
    return view('home',[
        "title" => "Home",
        "lapor" => "Pelaporan Bencana",
        "history" => "History Laporan"
    ]);
});

Route::get('/news', function () {
    
        $news_post = [
        [
                "title" => "Bencana Alam Banjir,Longsor, &  Angin Puting Beliung",
                "slug" => "bencana-alam-banjir-longsor-&-angin-puting-beliung",
                "time" => "Senin 21 September 2020 Pukul 16.00 Wib",
                "location" => "Kec. Pamijahan, Kec.Ciawi, Kec Cisarua, Kec.Caringin, Kec.Cijeruk"
            ],
         [
                "title" => "Bencana Alam Angin Ribut",
                "slug" => "bencana-alam-angin-ribut",
                "time" => "28 Maret 2021 Pukul 14.00 WIB",
                "location" => "Kecamatan Jaten dan Kecamatan Tasikmadu, Kabupaten Karanganyar"
        ],
    ];
    return view('news',[
        "title" => "News",
        "news" => $news_post
    ]);
});    

Route::get('/login', function (){
$login_post = [
    [
        "title" => "User",
        "slug" => "login-user"
    ],
    [
        "title" => "Petugas",
        "slug" => "login-petugas"
    ],
    [
        "title" => "Admin",
        "slug" => "login-admin"
    ],
];

    return view('login',[
        "title" => "Login",
        "login" => $login_post
    ]);
});

Route::get('news/{slug}', function($news_post){
    return view('news2',[
        "title" => "News"
    ]);
});

Route::get('login/{slug}', function($slug){
    return view('login2',[
        "title" => "Login"
    ]);
});


Route::get('/registrasi', function (){
        return view('Registrasi',[
            "title" => "Registrasi",
            "id_kecamatan" => "ID Kecamatan",
            "password" => "Password",
            "email" => "Email",
            "tgl_lahir" => "Tanggal Lahir"
        ]);
    });


    Route::get('/about', function () {
        $about_post = [
            [
            "title" => "About",
            "nama" => "Finndy",
            "nim" => "152011513011"
            ],
            [
            "title" => "About",
            "nama" => "Novira",
            "nim" => "152011513003"
            ],
        ];
        return view('about',[
            "title" => "About",
            "about" => $about_post
        ]);
    });

