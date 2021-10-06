@extends('layout.main')

@section('container')

    @foreach ($login as $login)
        <article class= "mb-5">
            <h5>
                <a href="/login/{{ $login["slug"] }}">{{ $login["title"]  }}</a>
            </h5>
        </article>
    @endforeach    

@endsection