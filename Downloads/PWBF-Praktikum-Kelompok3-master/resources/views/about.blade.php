@extends('layout.main')

@section('container')
   
    @foreach ($about as $about)
        <article class= "mb-5">
            <h5>Nama: {{ $about["nama"] }}</h5>
            <h5>NIM: {{ $about["nim"] }}</h5>
        </article>
    @endforeach

@endsection