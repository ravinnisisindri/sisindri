<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>PersonalPortfoliAngular</title>
  <base href="/">
  <meta name="viewport" content="width=device-width, initial-scale=1">
 
  <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet" />
  <link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
  <link href="assets/css/aos.css" rel="stylesheet">
  <link href="assets/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/css/main.css" rel="stylesheet">
  <link rel="icon" type="image/x-icon" href="favicon.ico">
</head>
<body>
  <app-root></app-root>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="assets/js/core/popper.min.js"></script>
  <script src="assets/js/core/bootstrap.min.js"></script>
  <script src="assets/js/now-ui-kit.js?v=1.3.0"></script>
  <script src="assets/js/aos.js"></script>
  <script src="assets/js/main.js"></script>
</body>
</html>

Create a folder name it as profile
In Profile folder Create sub  folder name it as about
Create about.component.html
<div class="section" id="about">
    <div class="container">
        <div class="card" data-aos="fade-up" data-aos-offset="10">
            <div class="row">
                <div class="col-lg-6 col-md-12">
                    <div class="card-body">
                        <div class="h4 mt-0 title">About Me</div>
                            <p align="justify">From a young age, I’ve always had a sense of motivation and passion driving me forward. Whether it’s exploring unique opportunities, learning additional skills, or meeting new people, I bring these values to every experience throughout my life on a personal and professional level.</p>
                            <p align="justify">Lover of innovation and everything related to generate new knowledge.Face problems with a smile and solve them as soon as possible. Very calculated about the time I spend and work I do.</p>
                            <p align="justify">To learn more about me, keep exploring my site or reach out directly.</p>
                    </div>
                </div>    
                <div class="col-lg-6 col-md-12">       
                    <div class="card-body">
                        <div class="h4 mt-0 title">Basic Information</div>
                        <div class="row">
                            <div class="col-sm-4">
                                <strong class="text-uppercase">Date of Birth:</strong>
                            </div>
                            <div class="col-sm-8">Sep 10, 1998</div>
                        </div>
                        <div class="row mt-4">
                            <div class="col-sm-4">
                                <strong class="text-uppercase">Email:</strong>
                            </div>
                            <div class="col-sm-8">gadhehari11@gmail.com</div>
                        </div>
                        <div class="row mt-4">
                            <div class="col-sm-4">
                                <strong class="text-uppercase">Mobile No:</strong>
                            </div>
                            <div class="col-sm-8">9492419917</div>
                        </div>
                        <div class="row mt-4">
                            <div class="col-sm-4">
                                <strong class="text-uppercase">Address:</strong>
                            </div>
                            <div class="col-sm-8">#Narasmiha sagar,Mangapet mandal,mulugu district,Telangana,506172</div>
                        </div>
                        <div class="row mt-4">
                            <div class="col-sm-4">
                                <strong class="text-uppercase">Language:</strong>
                            </div>
                            <div class="col-sm-8">Telugu,hindhi,English</div>
                        </div>
                     </div>
                </div>
            </div>
        </div>
    </div>
</div>

Create about.component.css
Create about.component.spec.ts
import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AboutComponent } from './about.component';

describe('AboutComponent', () => {
  let component: AboutComponent;
  let fixture: ComponentFixture<AboutComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AboutComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AboutComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});


Create about.components.ts
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.scss']
})
export class AboutComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}


In Profile folder Create sub  folder name it as content
Create contact.component.html
<div class="section" id="contact">
    <div class="cc-contact-information" style="background-image: url('assets/images/contact.jpg');">
      <div class="container">
        <div class="cc-contact">
          <div class="row">
            <div class="col-md-9">
              <div class="card mb-0" data-aos="zoom-in">
                <div class="h4 text-center title">Contact Me</div>
                <div class="row">
                  <div class="col-md-6">
                    <div class="card-body">
                      <form name="form" (ngSubmit)="f.form.valid ; f.resetForm()" #f="ngForm" novalidate>
                        <div class="p pb-3">
                          <strong>Feel free to contact me </strong>
                        </div>
                        <div class="row mb-3">
                          <div class="col">
                            <div class="input-group">
                              <input class="form-control" type="text" name="name" #name placeholder="Name"
                                [(ngModel)]="model.name" #name="ngModel"
                                [ngClass]="{ 'is-invalid': f.submitted && name.invalid }" required />
                            </div>
                          </div>
                        </div>
                        <div class="row mb-3">
                          <div class="col">
                            <div class="input-container">
                              <input class="form-control" type="text" name="subject" #subject placeholder="Subject"
                                [(ngModel)]="model.subject" #subject="ngModel"
                                [ngClass]="{ 'is-invalid': f.submitted && subject.invalid }" required />
                            </div>
                          </div>
                        </div>
                        <div class="row mb-3">
                          <div class="col">
                            <div class="input-group">
                              <input class="form-control" type="text" name="email"  #email placeholder="E-mail"
                                [(ngModel)]="model.email" #email="ngModel"
                                [ngClass]="{ 'is-invalid': f.submitted && email.invalid }"
                                pattern="^([a-zA-Z0-9_\-\.]+)@([a-zA-Z0-9_\-\.]+)\.([a-zA-Z]{2,5})$" required />
                            </div>
                          </div>
                        </div>
                        <div class="row mb-3">
                          <div class="col">
                            <div class="form-group">
                              <textarea class="form-control" name="message" #message placeholder="Your Message"
                                [(ngModel)]="model.message" #message="ngModel"
                                [ngClass]="{ 'is-invalid': f.submitted && message.invalid }" required></textarea>
                            </div>
                          </div>
                        </div>
                        <div class="row">
                          <div class="col">
                            <button class="btn btn-primary" type="submit" (click)="onSubmit(name.value, subject.value, email.value, message.value)"> Send</button>
                          </div>
                        </div>
                      </form>
                    </div>
                  </div>
                  <div class="col-md-6">
                    <div class="card-body">
                        <p class="mb-0">
                            <strong>Phone</strong>
                        </p>
                        <p class="pb-2">+91 8919236779</p>
                        <p class="mb-0">
                            <strong>Email</strong>
                        </p>
                        <p>rahulkumar.nidamanuri@gmail.com</p>
                    </div>
                </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <ng-snotify class="material"></ng-snotify>


Create contact.component.scss
Create contact.component.spec.ts
import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ContactComponent } from './contact.component';

describe('ContactComponent', () => {
  let component: ContactComponent;
  let fixture: ComponentFixture<ContactComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ContactComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ContactComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});


Create contact.component.ts
import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { HttpHeaders} from '@angular/common/http';
import { ProfileService } from '../profile.service';
import { SnotifyService } from 'ng-snotify';
import { environment } from '../../../environments/environment';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.scss']
})
  export class ContactComponent implements OnInit {
    model: any = {};
  
    constructor(
      private http: HttpClient
    ){}
  
    ngOnInit() {
       }
       onSubmit(name, subject, email, message) {
          const headers = new HttpHeaders({ 'Content-Type': 'application/json' });
          this.http.post('https://formspree.io/f/mwkwpzve',
            { name: name, subject: subject, replyto: email, message: message },
            { 'headers': headers }).subscribe(
              response => {
                console.log(response);
              }
            );
        }  
}



In Profile folder Create sub  folder name it as education
Create education.component.html
<div class="section" id="education">
    <div class="container cc-education">
        <div class="h4 text-center mb-4 title">Education</div>
            <div class="card">
                <div class="row">
                    <div class="col-md-3 bg-primary" data-aos="fade-right" data-aos-offset="50" data-aos-duration="500">
                        <div class="card-body cc-education-header">
                            <p>2015-2019</p>
                        <div class="h5">Bachelor Degree</div>
                        </div>    
                    </div>
                    <div class="col-md-9" data-aos="fade-left" data-aos-offset="50" data-aos-duration="500">
                        <div class="card-body">
                            <div class="h4">Bachelor of Engineering</div>
                                <h4 class="category">QIS College Of Engineering and Technology</h4>
                                <ul>
                                    <li> QIS College Of Engineering and Technology <b>ranks 2st</b> in AndhraPradesh </li>
                                        <li>Completed B-tech in Computer Science and Engineering with <b>83% </b>.</li>
                                </ul>
                        </div>
                    </div>
                </div>
            </div>
            <div class="card">
                <div class="row">
                    <div class="col-md-3 bg-primary" data-aos="fade-right" data-aos-offset="50" data-aos-duration="500">
                        <div class="card-body cc-education-header">
                            <p>2013-2015</p>
                        <div class="h5">Secondary education</div>
                        </div>    
                    </div>
                    <div class="col-md-9" data-aos="fade-left" data-aos-offset="50" data-aos-duration="500">
                        <div class="card-body">
                            <div class="h4">Inter MPC</div>
                            <h4 class="category">Sri Chaitanya jr College</h4>
                            <ul>
                                    <li>Completed secondary education with <b>73%</b> aggregate.</li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <div class="card">
                <div class="row">
                    <div class="col-md-3 bg-primary" data-aos="fade-right" data-aos-offset="50" data-aos-duration="500">
                        <div class="card-body cc-education-header">
                            <p>2013</p>
                        <div class="h5">Primary education</div>
                        </div>    
                    </div>
                    <div class="col-md-9" data-aos="fade-left" data-aos-offset="50" data-aos-duration="500">
                        <div class="card-body">
                            <div class="h5">tel Medium</div>
                                <h4 class="category">Damodara Public Schoole</h4>
                                <ul>
                                        <li>Completed with <b>80% </b>aggregate.</li>
                                </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>                                            
</div>     

Create education.component.scss
Create education.component.spec.ts
import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EducationComponent } from './education.component';

describe('EducationComponent', () => {
  let component: EducationComponent;
  let fixture: ComponentFixture<EducationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EducationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EducationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});


Create education.component.ts
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-education',
  templateUrl: './education.component.html',
  styleUrls: ['./education.component.scss']
})
export class EducationComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}



In Profile folder Create sub  folder name it as footer
Create footer.component.html
<footer class="footer">
    <div class="container text-center">
        <a class="cc-facebook btn btn-link" href="https://www.facebook.com/Mr.YuvaKeratam/" target="_blank">
            <i class="fa fa-facebook fa-2x " aria-hidden="true"></i>
        </a>
        <a class="cc-instagram btn btn-link" href="https://www.instagram.com/mr.yuvakeratam/" target="_blank">
            <i class="fa fa-instagram fa-2x " aria-hidden="true"></i>
        </a>
        <a class="cc-github btn btn-link " href="https://https://github.com/NidamanuriRahulKumar/" target="_blank">
            <i class="fa fa-github fa-2x " aria-hidden="true"></i>
        </a>
    </div>
    <div class="text-center text-muted">
        <p>&copy; All rights reserved.</p>
    </div>
</footer>

Create footer.component.scss
Create footer.component.spec.ts
import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FooterComponent } from './footer.component';

describe('FooterComponent', () => {
  let component: FooterComponent;
  let fixture: ComponentFixture<FooterComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FooterComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FooterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});


Create footer.component.ts
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.scss']
})
export class FooterComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}


In Profile folder Create sub  folder name it as header
Create header.component.html
<header>
    <div class = "profile-page sidebar-collapse">
        <nav class="navbar navbar-expand-lg fixed-top navbar-transparent bg-primary" color-on-scroll="400">
            <div class="container">
            <div class="navbar-translate">
                <a class="navbar-brand" href="#" rel="tooltip">Mr.YuvaKeratam</a>
                <button class="navbar-toggler navbar-toggler" type="button" data-toggle="collapse" data-target="#navigation" aria-controls="navigation" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-bar bar1"></span>
                    <span class="navbar-toggler-bar bar2"></span>
                    <span class="navbar-toggler-bar bar3"></span>
                </button>
            </div>
            <div class="collapse navbar-collapse justify-content-end" id="navigation">
                <ul class="navbar-nav">
                  <li class="nav-item">
                    <a class="nav-link smooth-scroll" href="#about">About</a>
                  </li>
                    <li class="nav-item">
                    <a class="nav-link smooth-scroll" href="#skill">Skills</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link smooth-scroll" href="#education">Education</a>
                  </li>
    
                  <li class="nav-item">
                      <a class="nav-link smooth-scroll" href="#reference">Reference</a>
                    </li>
    
                  <li class="nav-item">
                    <a class="nav-link smooth-scroll" href="#contact">Contact</a>
                  </li>
                </ul>
              </div>
            </div>
        </nav>
    </div>
</header>


Create header.component.scss
Create header.component.spec.ts
import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HeaderComponent } from './header.component';

describe('HeaderComponent', () => {
  let component: HeaderComponent;
  let fixture: ComponentFixture<HeaderComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HeaderComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HeaderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});


Create header.component.ts
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}




In Profile folder Create sub  folder name it as intro
Create intro.component.html
<div class="profile-page">
    <div class="wrapper">
        <div class="page-header page-header-small" filter-color="orange">
            <div class="page-header-image" data-parallax="true" style="background-image: url('assets/images/introduction.jpg');">
            </div>
        <div class="container">
            <div class="content-center">
                <div class="profile-image">
                    <a href="#">
                        <img src="assets/images/profile.jpg" alt="Image" />
                    </a>
                </div>
                <div class="h2 title">Nidamanuri Rahul Kumar</div>
                <p class="category text-white">Java Full STack Developer</p>
                <a class="btn btn-primary smooth-scroll mr-2" href="#contact" data-aos="zoom-in" data-aos-anchor="data-aos-anchor">Hire Me</a>
                <a class="btn btn-primary"href="https://docs.google.com/document/d/1HSVZPYX0c_d6fkFsfNOAAnb3--LGD2Lo/edit?usp=sharing&ouid=105500183977979454287&rtpof=true&sd=true" target="_blank" data-aos="zoom-in" data-aos-anchor="data-aos-anchor">Download CV</a>
            </div>
        </div>
        <div class="section">
            <div class="container">
                <div class="button-container">
                    <a class="btn btn-default btn-round btn-lg btn-icon" href="https://www.facebook.com/Mr.YuvaKeratam/" target="_blank" rel="tooltip" title="Follow me on Facebook">
                        <i class="fa fa-facebook"></i>
                    </a>
                    <a class="btn btn-default btn-round btn-lg btn-icon" href="https://www.instagram.com/mr.yuvakeratam/" target="_blank" rel="tooltip" title="Follow me on Linkedin">
                        <i class="fa fa-linkedin"></i>
                    </a>
                    <a class="btn btn-default btn-round btn-lg btn-icon" href="https://github.com/NidamanuriRahulKumar/" target="_blank" rel="tooltip" title="Follow me on Github">
                        <i class="fa fa-github"></i>
                    </a>
                </div>
            </div>
        </div>
        </div>
    </div>
</div>

Create intro.component.scss
Create intro.component.spec.ts
import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { IntroComponent } from './intro.component';

describe('IntroComponent', () => {
  let component: IntroComponent;
  let fixture: ComponentFixture<IntroComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ IntroComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(IntroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});





Create intro.component.ts
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-intro',
  templateUrl: './intro.component.html',
  styleUrls: ['./intro.component.scss']
})
export class IntroComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}


In Profile folder Create sub  folder name it as skills
Create skills.component.html
<div class="section" id="skill">
    <div class="container">
      <div class="h4 text-center mb-4 title">Skills</div>
      <div class="card" data-aos="fade-up" data-aos-anchor-placement="top-bottom">
        <div class="card-body">
          <div class="row">
            <div class="col-md-6">
              <div class="progress-container progress-primary">
                <span class="progress-badge">Java</span>
                <div class="progress">
                  <div class="progress-bar progress-bar-primary" data-aos="progress-full" data-aos-offset="10"
                    data-aos-duration="2000" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
                    style="width: 85%;"></div>
                  <span class="progress-value">85%</span>
                </div>
              </div>
            </div>
          <div class="row">
            <div class="col-md-6">
              <div class="progress-container progress-primary">
                <span class="progress-badge">Spring Framework</span>
                <div class="progress">
                  <div class="progress-bar progress-bar-primary" data-aos="progress-full" data-aos-offset="10"
                    data-aos-duration="2000" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
                    style="width: 70%;"></div>
                  <span class="progress-value">70%</span>
                </div>
              </div>
            </div>
            <div class="col-md-6">
              <div class="progress-container progress-primary">
                <span class="progress-badge">Angular8</span>
                <div class="progress">
                  <div class="progress-bar progress-bar-striped progress-bar-animated" data-aos="progress-full" data-aos-offset="10"
                    data-aos-duration="2000" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
                    style="width: 60%;"></div>
                  <span class="progress-value">60%</span>
                </div>
              </div>
            </div>
          </div>
          <div class="row">
            <div class="col-md-6">
              <div class="progress-container progress-primary">
                <span class="progress-badge">RDBMS</span>
                <div class="progress">
                  <div class="progress-bar progress-bar-primary" data-aos="progress-full" data-aos-offset="10"
                    data-aos-duration="2000" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
                    style="width: 75%;"></div>
                  <span class="progress-value">75%</span>
                </div>
              </div>
            </div>
            <div class="col-md-6">
              <div class="progress-container progress-primary">
                <span class="progress-badge">HTML,CSS,JS</span>
                <div class="progress">
                  <div class="progress-bar progress-bar-primary" data-aos="progress-full" data-aos-offset="10"
                    data-aos-duration="2000" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
                    style="width: 70%;"></div>
                  <span class="progress-value">70%</span>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>

Create skills.component.scss
Create skills.component.spec.ts
import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SkillsComponent } from './skills.component';

describe('SkillsComponent', () => {
  let component: SkillsComponent;
  let fixture: ComponentFixture<SkillsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SkillsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SkillsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

Create skills.component.ts
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.scss']
})
export class SkillsComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}


In Profile create profile.component.html
<app-header></app-header>
<div class ="page-content">
    <app-intro></app-intro>
    <app-about></app-about>
    <app-skills></app-skills>
    <app-education></app-education>
    <app-contact></app-contact>
</div>
<app-footer></app-footer>
<ngx-spinner bdColor="rgba(255,255,255,1)" size="medium" color="#033d5b" type="ball-spin-clockwise"></ngx-spinner>


In Profile create profile.component.scss
In Profile create profile.component.spec.ts
import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProfileComponent } from './profile.component';

describe('ProfileComponent', () => {
  let component: ProfileComponent;
  let fixture: ComponentFixture<ProfileComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProfileComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProfileComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});


In Profile create profile.component.ts
import { Component, OnInit } from '@angular/core';
import { NgxSpinnerService } from 'ngx-spinner';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.scss']
})
export class ProfileComponent implements OnInit {

  constructor(
    private spinner: NgxSpinnerService
  ) { }
  ngOnInit() {
    this.spinner.show();
    setTimeout(() => {
        this.spinner.hide();
    }, 2000);
  }

}
In Profile create profile.module.ts
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SnotifyModule, SnotifyService, ToastDefaults } from 'ng-snotify';
import { ProfileComponent } from './profile.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { IntroComponent } from './intro/intro.component';
import { AboutComponent } from './about/about.component';
import { NgxSpinnerModule } from 'ngx-spinner';
import { ContactComponent } from './contact/contact.component';
import { EducationComponent } from './education/education.component';
import { SkillsComponent } from './skills/skills.component';
import {FormsModule,ReactiveFormsModule} from '@angular/forms';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    SnotifyModule,
    FormsModule,
    ReactiveFormsModule,
    NgxSpinnerModule
  ],
  declarations: [
    ProfileComponent,
    HeaderComponent,
    FooterComponent,
    AboutComponent,
    IntroComponent,
    ContactComponent,
    EducationComponent,
    SkillsComponent,
  ],
  providers: [
    { provide: 'SnotifyToastConfig', useValue: ToastDefaults},
    SnotifyService,
  ]
})
export class ProfileModule { }


In profile Create profile.service.ts
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { environment } from '../../environments/environment';

@Injectable({
    providedIn: 'root'
  })
  export class ProfileService {
    baseUrl = environment.baseUrl;

  constructor(
    private http: HttpClient
  ) { }

  contactus(data: any): Observable<any> {
    return this.http.post('http://localhost:4200/contact',data);
  }
  }

In profile open app.component.html
<router-outlet></router-outlet>

In profile open app.module.ts
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { RouterModule, Routes, ExtraOptions } from '@angular/router';
import { ProfileComponent } from './profile/profile.component';
import { ProfileModule } from './profile/profile.module';
import { HttpClientModule } from '@angular/common/http';
import {FormsModule,ReactiveFormsModule} from '@angular/forms';

const routes: Routes = [
  {
    path: '',
    component: ProfileComponent
  }
];

const config: ExtraOptions = {
  useHash: true,
};

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule.forRoot(routes, config),
    ProfileModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

In profile open app.component.spec.ts
import { TestBed, async } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { AppComponent } from './app.component';

describe('AppComponent', () => {
  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [
        RouterTestingModule
      ],
      declarations: [
        AppComponent
      ],
    }).compileComponents();
  }));

  it('should create the app', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app).toBeTruthy();
  });

  it(`should have as title 'Personal-Portfolio-Angular'`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.title).toEqual('Personal-Portfolio-Angular');
  });

  it('should render title', () => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.nativeElement;
    expect(compiled.querySelector('.content span').textContent).toContain('Personal-Portfolio-Angular app is running!');
  });
});


Open JS folder create file main.js
// Add your javascript here
// Don't forget to add it into respective layouts where this js file is needed

$(document).ready(function() {
  AOS.init( {
    // uncomment below for on-scroll animations to played only once
    // once: true  
  }); // initialize animate on scroll library
});

// Smooth scroll for links with hashes
$('a.smooth-scroll')
.click(function(event) {
  // On-page links
  if (
    location.pathname.replace(/^\//, '') == this.pathname.replace(/^\//, '') 
    && 
    location.hostname == this.hostname
  ) {
    // Figure out element to scroll to
    var target = $(this.hash);
    target = target.length ? target : $('[name=' + this.hash.slice(1) + ']');
    // Does a scroll target exist?
    if (target.length) {
      // Only prevent default if animation is actually gonna happen
      event.preventDefault();
      $('html, body').animate({
        scrollTop: target.offset().top
      }, 1000, function() {
        // Callback after animation
        // Must change focus!
        var $target = $(target);
        $target.focus();
        if ($target.is(":focus")) { // Checking if the target was focused
          return false;
        } else {
          $target.attr('tabindex','-1'); // Adding tabindex for elements not focusable
          $target.focus(); // Set focus again
        };
      });
    }
  }
});

