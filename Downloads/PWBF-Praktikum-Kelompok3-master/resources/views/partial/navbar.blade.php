<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <div class="container-fluid">
    <a class="navbar-brand" href="/home">|Pelaporan Bencana|</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link {{ ($title === "Home" ) ? 'active' : '' }}" href="/home">HOME</a>
        </li>
        <li class="nav-item">
          <a class="nav-link {{ ($title === "About" ) ? 'active' : '' }}" href="/about">ABOUT</a>
        </li>
        <li class="nav-item">
          <a class="nav-link {{ ($title === "News" ) ? 'active' : '' }}" href="/news">NEWS</a>
        </li>
        <li class="nav-item">
          <a class="nav-link {{ ($title === "Login" ) ? 'active' : '' }}" href="/login">LOGIN</a>
        </li>
        <li class="nav-item">
          <a class="nav-link {{ ($title === "Registrasi" ) ? 'active' : '' }}" href="/registrasi">REGISTRASI</a>
        </li>
      </ul>
    </div>
  </div>
</nav>