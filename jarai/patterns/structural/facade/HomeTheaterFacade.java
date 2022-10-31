package jarai.patterns.structural.facade;

public class HomeTheaterFacade {
    Amplifier _amp;
    Tuner _tuner;
    DvdPlayer _dvd;
    CdPlayer _cd;
    Projector _projector;
    TheaterLights _lights;
    Screen _screen;
    PopcornPopper _popper;

    public HomeTheaterFacade(Amplifier amp,
                             Tuner tuner,
                             DvdPlayer dvd,
                             CdPlayer cd,
                             Projector projector,
                             Screen screen,
                             TheaterLights lights,
                             PopcornPopper popper) {

        _amp = amp;
        _tuner = tuner;
        _dvd = dvd;
        _cd = cd;
        _projector = projector;
        _screen = screen;
        _lights = lights;
        _popper = popper;
    }

    public void WatchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        _popper.On();
        _popper.Pop();
        _lights.Dim(10);
        _screen.Down();
        _projector.On();
        _projector.WideScreenMode();
        _amp.On();
        _amp.SetDvd(_dvd);
        _amp.SetSurroundSound();
        _amp.SetVolume(5);
        _dvd.On();
        _dvd.Play(movie);
    }


    public void EndMovie() {
        System.out.println("Shutting movie theater down...");
        _popper.Off();
        _lights.On();
        _screen.Up();
        _projector.Off();
        _amp.Off();
        _dvd.Stop();
        _dvd.Eject();
        _dvd.Off();
    }

    public void ListenToCd(String cdTitle) {
        System.out.println("Get ready for an audiopile experence...");
        _lights.On();
        _amp.On();
        _amp.SetVolume(5);
        _amp.SetCd(_cd);
        _amp.SetStereoSound();
        _cd.On();
        _cd.Play(cdTitle);
    }

    public void EndCd() {
        System.out.println("Shutting down CD...");
        _amp.Off();
        _amp.SetCd(_cd);
        _cd.Eject();
        _cd.Off();
    }

    public void ListenToRadio(double frequency) {
        System.out.println("Tuning in the airwaves...");
        _tuner.On();
        _tuner.SetFrequency(frequency);
        _amp.On();
        _amp.SetVolume(5);
        _amp.SetTuner(_tuner);
    }

    public void EndRadio() {
        System.out.println("Shutting down the tuner...");
        _tuner.Off();
        _amp.Off();
    }
}
