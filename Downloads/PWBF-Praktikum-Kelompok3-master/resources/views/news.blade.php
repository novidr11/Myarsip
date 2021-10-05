@extends('layout.main')

@section('container')
   
    @foreach ($news as $news)
        <article class= "mb-5">
            <h3>
                <a href="/news/{{ $news["slug"] }}">{{ $news["title"]  }}</a>
            </h3>
            <h5>Waktu: {{ $news["time"] }}</h5>
            <h5>Lokasi: {{ $news["location"] }}</h5>
        </article>
    @endforeach

@endsection