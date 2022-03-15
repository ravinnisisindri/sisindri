<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Quiz</title>
  <base href="/">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="icon" type="image/x-icon" href="./assets/images/quizlog-removebg-preview.png">
  <link rel="preconnect" href="https://fonts.gstatic.com">
  <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500&display=swap" rel="stylesheet">
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>
  <app-root></app-root>
</body>
</html>

<app-navbar></app-navbar>
<div id="heading" class="text-center font-weight-bold">Quiz</div>
<img id = "img" src="../../assets/images/line.svg" height="200" width="100%">
<div id="name" class="py-4 mb-0 px-3 ml-2 mr-2">
    <div id="head1" class="text-center text-white"><strong>Quiz</strong> Secure, Professional Web Based Quiz Easy to use,for business, training and educational assessment with instantly scored tests and quizzes saving you hours of paperwork!</div>
</div>
<div id = "con" class="container">
    <div class="bg-white rounded shadow-lg mb-5 mt-5 py-3 px-3">
        <div class="row row-cols-2 py-3">
            <div class="col">
            <img src="../../assets/images/assess.jpg" width="500" height="300">
            </div>

            <div class="col">
            <br><br><br>
            <h5 class="card-title"><strong>Take The Assessment</strong></h5>
            <p class="card-text">Spend less than 15 min answering 10 Questions about your selected Category.</p>
            </div>

            <div class="col">
            <br>
            <img src="../../assets/images/Score.jpg" width="500" height="300">
            </div>
            
            <div class="col">
            <br><br><br>
            <h5 class="card-title"><strong>See How You Scored</strong></h5>
            <p class="card-text">You will immediately see your overall score, which measure your current ability.</p>
            </div>

        </div>
    </div>
</div>
<app-footer></app-footer>

<app-navbar></app-navbar>
<!DOCTYPE html>
<html>
<head></head>
<body>
    <div class="row justify-content-center">
        <div class="col-md-4 text-left bg-white rounded shadow-lg mb-5 mt-5  py-3">
            <div><h3><strong>Contact us</strong></h3></div><br>
            <form (ngSubmit) = "onsubmit(signupform)" #signupform = "ngForm">
                <div class="form-row">
                    <div class="form-group col-12">
                        <label for="fname">Name</label>
                        <input type="text" class="form-control" id="fname" name="Ufname" ngModel required  #fname="ngModel">
                        <small *ngIf = '!fname.valid &&  fname.touched' class="text-danger">Please Enter Your name</small>
                    </div>  
                </div>

                <div class="form-group">
                    <label for="email">Email</label>
                    <input type="email" class="form-control" id="email" placeholder="gadhehariharan18@gmail.com" name="Umail" ngModel required email #email="ngModel">
                    <small *ngIf = '!email.valid &&  email.touched' class="text-danger">Please Enter Valid Email</small>
                </div>

                <div class="form-group">
                    <label>Your Message</label>
                    <textarea class="text-left" name="text" rows="4" cols="47"></textarea>

                </div>
                
                <button type="submit" class="btn btn-primary float-right" [disabled] = '!signupform.valid'>Submit</button>
            </form>
        </div>
    </div>
</body>
</html>
<app-footer></app-footer>

<!DOCTYPE html>
<html>
<head></head>
<body>
    <div class="row justify-content-center">
        <div class="col-md-6 text-left bg-white rounded shadow-lg mb-5 mt-5 py-3">
            <img class="rounded mx-auto d-block mb-4" src="../../assets/images/quizlog-removebg-preview.png" width="72" height="72" >
            <h1 class="h2 mb-3 font-weight-normal text-center">Create your Quiz Account</h1><br>
            <form (ngSubmit) = "onsubmit(signupform)" #signupform = "ngForm">
                <div class="form-row">
                    <div class="form-group col-md-6">
                        <label for="fname">First Name</label>
                        <input type="text" class="form-control" id="fname" name="Ufname" ngModel required  #fname="ngModel">
                        <small *ngIf = '!fname.valid &&  fname.touched' class="text-danger">Please Enter Your name</small>
                    </div>

                    <div class="form-group col-md-6">
                        <label for="lname">Last Name</label>
                        <input type="text" class="form-control" id="lname" name="Ulname" ngModel>
                    </div>
                </div>

                <div class="form-group">
                    <label for="email">Email</label>
                    <input type="email" class="form-control" id="email" placeholder="john@abc.com" name="Umail" ngModel required email #email="ngModel">
                    <small *ngIf = '!email.valid &&  email.touched' class="text-danger">Please Enter Valid Email</small>
                </div>

                <div class="form-group">
                    <label for="pass">Password</label>
                    <input type="password" class="form-control" id="pass" name="Upass" ngModel required #pass="ngModel">
                    <small *ngIf = '!pass.valid &&  pass.touched' class="text-danger">Please Enter Password</small>
                </div>
                
                <button type="submit" class="btn btn-primary float-right" [disabled] = '!signupform.valid'>Create Account</button>
            </form>
        </div>
    </div>
</body>
</html>
<app-footer></app-footer>

<!DOCTYPE html>
<html>
<head></head>
<body>
    <div style="padding:245px">
        <h1 class="text-center">404 error</h1><br>
        <h3 class="text-center">Page Not Found</h3><br>
        <h6 class="text-center text-muted">The page your looking for doesn't exist <br>or an other error occurred.</h6>
    </div>
</body>
</html>
<!DOCTYPE html>
<html>
<head></head>
<body>
    <br><br>
    <footer class="pt-3 my-md-3 pt-md-3 border-top" style="padding-left: 20px; padding-right: 20px;">
        <div class="row">
            <div class="col-12 col-md">
                <img src="./assets/images/quizlog-removebg-preview.png" width="50" height="50">
                <span class="text-muted">  &copy; 2021-All Rights Reserved.</span>
            </div>

            <span><a class="text-muted" [routerLink] = "['/contactus']">Contact us</a></span>
            <span><a class="text-muted" [routerLink] = "['/privacy']">Privacy & Terms</a></span>
            
            <span>
                <a><i class="bi bi-twitter"></i></a>
                <a id ="mid"><i class="bi bi-instagram"></i></a>
                <a ><i class="bi bi-facebook"></i></a>
            </span>
        </div>
    </footer>
</body>
</html>

<!DOCTYPE html>
<html>
<head></head>
<body>
    <div class="row justify-content-center">
        <div class="col-md-4 text-left bg-white rounded shadow-lg mb-5 mt-5 py-3">
            <img class="rounded mx-auto d-block mb-4" src="../../assets/images/quizlog-removebg-preview.png" alt="" width="72" height="72" >
            <form (ngSubmit) = "onsubmit(signupform)" #signupform = "ngForm">
                <div class="form-group">
                    <label for="email">Email</label>
                    <input type="email" class="form-control" id="email" placeholder="john@abc.com" name="Umail" ngModel required email #email="ngModel">
                    <small *ngIf = '!email.valid &&  email.touched' class="text-danger">Please Enter Valid Email</small>
                </div>

                <div class="form-group">
                    <label for="pass">New Password</label>
                    <input type="password" class="form-control" id="pass" name="Upass" ngModel required #pass="ngModel">
                    <small *ngIf = '!pass.valid &&  pass.touched' class="text-danger">Please Enter New Password</small>
                </div>
                
                <button type="submit" class="btn btn-primary float-right" [disabled] = '!signupform.valid'>Change Password</button>
            </form>
        </div>
    </div>
</body>
</html>
<app-footer></app-footer>

<app-navbar></app-navbar>
<!doctype html>
<html>
<body >
    <div class="container" >
        <div class="d-flex align-items-center p-3 my-3 text-white-50 rounded shadow-lg">
            <img class="mr-3" src="../../assets/images/hat2.svg" alt="" width="60" height="60">
            <div class="lh-100">
            <h6 class="mb-0 text-white lh-100">Quizes Catalog's</h6>
            </div>
        </div>

        <div class="my-5 p-3 bg-white rounded shadow-lg">
            <h6 class="border-bottom border-gray pb-2 mb-0"> Live Quizes</h6>
            <div class="media text-muted pt-3">
                <img src="../../assets/images/pencil.svg" width="40" height="40">
                <div class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
                    <div class="d-flex justify-content-between align-items-center w-100">
                        <strong class="text-gray-dark">GK</strong>
                        <a class="btn btn-outline-success" [routerLink] = "['/quizhome']" role="button" (click)="sentpath('GK')" >Attempt</a>
                    </div>
                </div>
            </div>

            <div class="media text-muted pt-3">
                <img src="../../assets/images/pencil.svg" width="40" height="40">
                <div class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
                    <div class="d-flex justify-content-between align-items-center w-100">
                        <strong class="text-gray-dark">Technology</strong>
                        <a class="btn btn-outline-success" [routerLink] = "['/quizhome']" role="button" (click)="sentpath('Technology')">Attempt</a>
                    </div>
                </div>
            </div>

            <div class="media text-muted pt-3">
                <img src="../../assets/images/pencil.svg" width="40" height="40">
                <div class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
                    <div class="d-flex justify-content-between align-items-center w-100">
                        <strong class="text-gray-dark">Aptitude</strong>
                        <a class="btn btn-outline-success" [routerLink] = "['/quizhome']" role="button" (click)="sentpath('Aptitude')" >Attempt</a>
                    </div>
                </div>
            </div>  
        </div>
    </div>
</body>
</html>
<app-footer></app-footer>

<app-navbar></app-navbar>
<table>
    <tr>
        <th>
            <div id = "back" class="container">
                <h1 class="display-4">Ready for<br>meaningful engagement?</h1>
                <p class="lead">Find and Create exciting Quizzzzes.</p>
                <a class="btn btn-lg" [routerLink] = "['/getstart']" role="button">Get Started <i class="bi bi-arrow-right-short"></i></a>
            </div>
        </th>

        <th>
            <img src="../../assets/images/Effective-teamwork.png" width="820" height="513">
        </th>
    </tr>     
</table>       
<app-footer></app-footer>

<!DOCTYPE html>
<html>
<head></head>
<body>
    <div class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom shadow-sm fixed-top">
        <h5 class="my-0 mr-md-auto font-weight-normal"><a [routerLink] = "['/']"><img src="../assets/images/quizmain-removebg-preview.png" style="height: 40px;width:90px;"></a></h5>
        <nav class="my-2 my-md-0 mr-md-3">
            <a class="p-2 text-dark" [routerLink] = "['/about']">About</a>
            <span *ngIf ='uname!=""' class = "p-2 text-dark"> |&nbsp; {{uname}}</span>
            <a *ngIf ='uname==""' class="p-2 text-dark" onclick="document.getElementById('id01').style.display='block'" style="width:auto;">Sign in</a>
        </nav>
        <a *ngIf ='uname!=""' class="btn btn-sm" [routerLink] = "['/']" (click) = 'onlogout()'><i class="bi bi-power"></i>&nbsp;SignOut</a>
        <a *ngIf ='uname==""' class="btn btn-lg" [routerLink] = "['/create']">Create an account</a>
    </div>

    <div id="id01" class="modal">
        <form class="modal-content animate">
            <div class="imgcontainer">
                <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close">&times;</span>
            </div>
        
            <form class="form-signin" style="border: 1; text-align: center;" (ngSubmit) = "onsubmit(signinform)" #signinform = "ngForm">
                <img class="mb-4" src="../../assets/images/quizlog-removebg-preview.png" alt="" width="72" height="72">
                <h1 class="h2 mb-3 font-weight-normal">Sign in</h1>
                
                <label for="email" class="sr-only">Email address</label>
                <input type="email" id="email" class="form-control" placeholder="Email address" name="Umail" required autofocus ngModel email #email="ngModel">
                <small *ngIf = '!email.valid &&  email.touched' class="text-danger float-left py-2">Please Enter Valid Email</small>
                
                <label for="pass" class="sr-only">Password</label>
                <input type="password" id="pass" class="form-control" placeholder="Password" name="Upass" ngModel required #pass="ngModel">
                <div id = "chk" style="text-align: right;"><a [routerLink] = "['/forget']">Forgot password?</a></div>
                
                <button type = "submit" class="btn btn-lg  btn-block mt-5 mb-3" [disabled] = '!signinform.valid'>Sign in</button>
                <p id = "bott">Don't have an account? <a [routerLink] = "['/create']">Create Account</a></p>
            </form>
        </form>
    </div>
    <script>
        var modal = document.getElementById('id01');
        window.onclick = function(event) {
            if (event.target == modal) {
                modal.style.display = "none";
            }
        }
    </script>
</body>
</html>

<app-navbar></app-navbar>
<!DOCTYPE html>
<html>
<head></head>
<body>
    <div class="row justify-content-center">
        <div class="col-md-8 text-left bg-white rounded shadow-lg mb-5 mt-5  py-3">
            <div class="text-center">
                <img class="mb-4 " src="../../assets/images/quizlog-removebg-preview.png" alt="" width="72" height="72">
            </div>
            
            <h1>Privacy Policy</h1>
            <p>Last updated: March 28, 2021</p>
            <p>This Privacy Policy describes Our policies and procedures on the collection, use and disclosure of Your information when You use the Service and tells You about Your privacy rights and how the law protects You.</p>
            <p>We use Your Personal data to provide and improve the Service. By using the Service, You agree to the collection and use of information in accordance with this Privacy Policy. This Privacy Policy has been created with the help of the.</p>
            <br>
            <h2>Interpretation</h2>
            <p>The words of which the initial letter is capitalized have meanings defined under the following conditions. The following definitions shall have the same meaning regardless of whether they appear in singular or in plural.</p>
            <h2>Definitions</h2>
            <p>For the purposes of this Privacy Policy:</p>
            <ul>
            <li>
            <p><strong>Account</strong> means a unique account created for You to access our Service or parts of our Service.</p>
            </li>
            <li>
            <p><strong>Company</strong> (referred to as either &quot;the Company&quot;, &quot;We&quot;, &quot;Us&quot; or &quot;Our&quot; in this Agreement) refers to quiz.</p>
            </li>
            <li>
            <p><strong>Cookies</strong> are small files that are placed on Your computer, mobile device or any other device by a website, containing the details of Your browsing history on that website among its many uses.</p>
            </li>
            <li>
            <p><strong>Country</strong> refers to: Maharashtra,  India</p>
            </li>
            <li>
            <p><strong>Device</strong> means any device that can access the Service such as a computer, a cellphone or a digital tablet.</p>
            </li>
            <li>
            <p><strong>Personal Data</strong> is any information that relates to an identified or identifiable individual.</p>
            </li>
            <li>
            <p><strong>Service</strong> refers to the Website.</p>
            </li>
            <li>
            <p><strong>Service Provider</strong> means any natural or legal person who processes the data on behalf of the Company. It refers to third-party companies or individuals employed by the Company to facilitate the Service, to provide the Service on behalf of the Company, to perform services related to the Service or to assist the Company in analyzing how the Service is used.</p>
            </li>
            <li>
            <p><strong>Third-party Social Media Service</strong> refers to any website or any social network website through which a User can log in or create an account to use the Service.</p>
            </li>
            <li>
            <p><strong>Usage Data</strong> refers to data collected automatically, either generated by the use of the Service or from the Service infrastructure itself (for example, the duration of a page visit).</p>
            </li>
            <li>
            <p><strong>Website</strong> refers to quiz, accessible from <a href="http://www.quizsite.com" rel="external nofollow noopener" target="_blank">http://www.quizsite.com</a></p>
            </li>
            <li>
            <p><strong>You</strong> means the individual accessing or using the Service, or the company, or other legal entity on behalf of which such individual is accessing or using the Service, as applicable.</p>
            </li>
            </ul>
            <h1>Collecting and Using Your Personal Data</h1>
            <h2>Types of Data Collected</h2>
            <h3>Personal Data</h3>
            <p>While using Our Service, We may ask You to provide Us with certain personally identifiable information that can be used to contact or identify You. Personally identifiable information may include, but is not limited to:</p>
            <ul>
            <li>
            <p>Email address</p>
            </li>
            <li>
            <p>First name and last name</p>
            </li>
            <li>
            <p>Phone number</p>
            </li>
            <li>
            <p>Usage Data</p>
            </li>
            </ul>
            <h3>Usage Data</h3>
            <p>Usage Data is collected automatically when using the Service.</p>
            <p>Usage Data may include information such as Your Device's Internet Protocol address (e.g. IP address), browser type, browser version, the pages of our Service that You visit, the time and date of Your visit, the time spent on those pages, unique device identifiers and other diagnostic data.</p>
            <p>When You access the Service by or through a mobile device, We may collect certain information automatically, including, but not limited to, the type of mobile device You use, Your mobile device unique ID, the IP address of Your mobile device, Your mobile operating system, the type of mobile Internet browser You use, unique device identifiers and other diagnostic data.</p>
            <p>We may also collect information that Your browser sends whenever You visit our Service or when You access the Service by or through a mobile device.</p>
            <h3>Tracking Technologies and Cookies</h3>
            <p>We use Cookies and similar tracking technologies to track the activity on Our Service and store certain information. Tracking technologies used are beacons, tags, and scripts to collect and track information and to improve and analyze Our Service. The technologies We use may include:</p>
            <ul>
            <li><strong>Cookies or Browser Cookies.</strong> A cookie is a small file placed on Your Device. You can instruct Your browser to refuse all Cookies or to indicate when a Cookie is being sent. However, if You do not accept Cookies, You may not be able to use some parts of our Service. Unless you have adjusted Your browser setting so that it will refuse Cookies, our Service may use Cookies.</li>
            <li><strong>Flash Cookies.</strong> Certain features of our Service may use local stored objects (or Flash Cookies) to collect and store information about Your preferences or Your activity on our Service. Flash Cookies are not managed by the same browser settings as those used for Browser Cookies. For more information on how You can delete Flash Cookies, please read &quot;Where can I change the settings for disabling, or deleting local shared objects?</li>
            <li><strong>Web Beacons.</strong> Certain sections of our Service and our emails may contain small electronic files known as web beacons (also referred to as clear gifs, pixel tags, and single-pixel gifs) that permit the Company, for example, to count users who have visited those pages or opened an email and for other related website statistics (for example, recording the popularity of a certain section and verifying system and server integrity).</li>
            </ul>
            <p>Cookies can be &quot;Persistent&quot; or &quot;Session&quot; Cookies. Persistent Cookies remain on Your personal computer or mobile device when You go offline, while Session Cookies are deleted as soon as You close Your web browser.</p>
            <p>We use both Session and Persistent Cookies for the purposes set out below:</p>
            <ul>
            <li>
            <p><strong>Necessary / Essential Cookies</strong></p>
            <p>Type: Session Cookies</p>
            <p>Administered by: Us</p>
            <p>Purpose: These Cookies are essential to provide You with services available through the Website and to enable You to use some of its features. They help to authenticate users and prevent fraudulent use of user accounts. Without these Cookies, the services that You have asked for cannot be provided, and We only use these Cookies to provide You with those services.</p>
            </li>
            <li>
            <p><strong>Cookies Policy / Notice Acceptance Cookies</strong></p>
            <p>Type: Persistent Cookies</p>
            <p>Administered by: Us</p>
            <p>Purpose: These Cookies identify if users have accepted the use of cookies on the Website.</p>
            </li>
            <li>
            <p><strong>Functionality Cookies</strong></p>
            <p>Type: Persistent Cookies</p>
            <p>Administered by: Us</p>
            <p>Purpose: These Cookies allow us to remember choices You make when You use the Website, such as remembering your login details or language preference. The purpose of these Cookies is to provide You with a more personal experience and to avoid You having to re-enter your preferences every time You use the Website.</p>
            </li>
            </ul>
            <p>For more information about the cookies we use and your choices regarding cookies, please visit our Cookies Policy or the Cookies section of our Privacy Policy.</p>
            <h2>Use of Your Personal Data</h2>
            <p>The Company may use Personal Data for the following purposes:</p>
            <ul>
            <li>
            <p><strong>To provide and maintain our Service</strong>, including to monitor the usage of our Service.</p>
            </li>
            <li>
            <p><strong>To manage Your Account:</strong> to manage Your registration as a user of the Service. The Personal Data You provide can give You access to different functionalities of the Service that are available to You as a registered user.</p>
            </li>
            <li>
            <p><strong>For the performance of a contract:</strong> the development, compliance and undertaking of the purchase contract for the products, items or services You have purchased or of any other contract with Us through the Service.</p>
            </li>
            <li>
            <p><strong>To contact You:</strong> To contact You by email, telephone calls, SMS, or other equivalent forms of electronic communication, such as a mobile application's push notifications regarding updates or informative communications related to the functionalities, products or contracted services, including the security updates, when necessary or reasonable for their implementation.</p>
            </li>
            <li>
            <p><strong>To provide You</strong> with news, special offers and general information about other goods, services and events which we offer that are similar to those that you have already purchased or enquired about unless You have opted not to receive such information.</p>
            </li>
            <li>
            <p><strong>To manage Your requests:</strong> To attend and manage Your requests to Us.</p>
            </li>
            <li>
            <p><strong>For business transfers:</strong> We may use Your information to evaluate or conduct a merger, divestiture, restructuring, reorganization, dissolution, or other sale or transfer of some or all of Our assets, whether as a going concern or as part of bankruptcy, liquidation, or similar proceeding, in which Personal Data held by Us about our Service users is among the assets transferred.</p>
            </li>
            <li>
            <p><strong>For other purposes</strong>: We may use Your information for other purposes, such as data analysis, identifying usage trends, determining the effectiveness of our promotional campaigns and to evaluate and improve our Service, products, services, marketing and your experience.</p>
            </li>
            </ul>
            <p>We may share Your personal information in the following situations:</p>
            <ul>
            <li><strong>With Service Providers:</strong> We may share Your personal information with Service Providers to monitor and analyze the use of our Service,  to contact You.</li>
            <li><strong>For business transfers:</strong> We may share or transfer Your personal information in connection with, or during negotiations of, any merger, sale of Company assets, financing, or acquisition of all or a portion of Our business to another company.</li>
            <li><strong>With Affiliates:</strong> We may share Your information with Our affiliates, in which case we will require those affiliates to honor this Privacy Policy. Affiliates include Our parent company and any other subsidiaries, joint venture partners or other companies that We control or that are under common control with Us.</li>
            <li><strong>With business partners:</strong> We may share Your information with Our business partners to offer You certain products, services or promotions.</li>
            <li><strong>With other users:</strong> when You share personal information or otherwise interact in the public areas with other users, such information may be viewed by all users and may be publicly distributed outside. If You interact with other users or register through a Third-Party Social Media Service, Your contacts on the Third-Party Social Media Service may see Your name, profile, pictures and description of Your activity. Similarly, other users will be able to view descriptions of Your activity, communicate with You and view Your profile.</li>
            <li><strong>With Your consent</strong>: We may disclose Your personal information for any other purpose with Your consent.</li>
            </ul>
            <h2>Retention of Your Personal Data</h2>
            <p>The Company will retain Your Personal Data only for as long as is necessary for the purposes set out in this Privacy Policy. We will retain and use Your Personal Data to the extent necessary to comply with our legal obligations (for example, if we are required to retain your data to comply with applicable laws), resolve disputes, and enforce our legal agreements and policies.</p>
            <p>The Company will also retain Usage Data for internal analysis purposes. Usage Data is generally retained for a shorter period of time, except when this data is used to strengthen the security or to improve the functionality of Our Service, or We are legally obligated to retain this data for longer time periods.</p>
            <h2>Transfer of Your Personal Data</h2>
            <p>Your information, including Personal Data, is processed at the Company's operating offices and in any other places where the parties involved in the processing are located. It means that this information may be transferred to — and maintained on — computers located outside of Your state, province, country or other governmental jurisdiction where the data protection laws may differ than those from Your jurisdiction.</p>
            <p>Your consent to this Privacy Policy followed by Your submission of such information represents Your agreement to that transfer.</p>
            <p>The Company will take all steps reasonably necessary to ensure that Your data is treated securely and in accordance with this Privacy Policy and no transfer of Your Personal Data will take place to an organization or a country unless there are adequate controls in place including the security of Your data and other personal information.</p>
            <h2>Disclosure of Your Personal Data</h2>
            <h3>Business Transactions</h3>
            <p>If the Company is involved in a merger, acquisition or asset sale, Your Personal Data may be transferred. We will provide notice before Your Personal Data is transferred and becomes subject to a different Privacy Policy.</p>
            <h3>Law enforcement</h3>
            <p>Under certain circumstances, the Company may be required to disclose Your Personal Data if required to do so by law or in response to valid requests by public authorities (e.g. a court or a government agency).</p>
            <h3>Other legal requirements</h3>
            <p>The Company may disclose Your Personal Data in the good faith belief that such action is necessary to:</p>
            <ul>
            <li>Comply with a legal obligation</li>
            <li>Protect and defend the rights or property of the Company</li>
            <li>Prevent or investigate possible wrongdoing in connection with the Service</li>
            <li>Protect the personal safety of Users of the Service or the public</li>
            <li>Protect against legal liability</li>
            </ul>
            <h2>Security of Your Personal Data</h2>
            <p>The security of Your Personal Data is important to Us, but remember that no method of transmission over the Internet, or method of electronic storage is 100% secure. While We strive to use commercially acceptable means to protect Your Personal Data, We cannot guarantee its absolute security.</p>
            <h1>Children's Privacy</h1>
            <p>Our Service does not address anyone under the age of 13. We do not knowingly collect personally identifiable information from anyone under the age of 13. If You are a parent or guardian and You are aware that Your child has provided Us with Personal Data, please contact Us. If We become aware that We have collected Personal Data from anyone under the age of 13 without verification of parental consent, We take steps to remove that information from Our servers.</p>
            <p>If We need to rely on consent as a legal basis for processing Your information and Your country requires consent from a parent, We may require Your parent's consent before We collect and use that information.</p>
            <h1>Links to Other Websites</h1>
            <p>Our Service may contain links to other websites that are not operated by Us. If You click on a third party link, You will be directed to that third party's site. We strongly advise You to review the Privacy Policy of every site You visit.</p>
            <p>We have no control over and assume no responsibility for the content, privacy policies or practices of any third party sites or services.</p>
            <h1>Changes to this Privacy Policy</h1>
            <p>We may update Our Privacy Policy from time to time. We will notify You of any changes by posting the new Privacy Policy on this page.</p>
            <p>We will let You know via email and/or a prominent notice on Our Service, prior to the change becoming effective and update the &quot;Last updated&quot; date at the top of this Privacy Policy.</p>
            <p>You are advised to review this Privacy Policy periodically for any changes. Changes to this Privacy Policy are effective when they are posted on this page.</p>
            <h1>Contact Us</h1>
            <p>If you have any questions about this Privacy Policy, You can contact us:</p>
            <ul>
            <li>By email: contact_us@quiz.com</li>
            </ul>   
        </div>
    </div>
</body>
</html>
<app-footer></app-footer>


<!DOCTYPE html>
<html>
<head></head>
<body>
    <div class="sidenav">
        <div *ngIf ='uname!=""'>
            <div style = "padding:10px;"><strong>Name:&nbsp;</strong>{{uname}}</div>
            <br>
        </div>

        <div style = "padding:10px;"><strong>Questions:-</strong></div>

        <div>
            <table  style="margin-left:4px">
                <tr>
                    <td><a id = "navbtn1" class="btn"  role="button" (click) ="btncontent(0)">1</a></td>
                    <td><a id = "navbtn2" class="btn"  role="button" (click) ="btncontent(1)">2</a></td>
                    <td><a id = "navbtn3" class="btn"  role="button" (click) ="btncontent(2)">3</a></td>
                    <td><a id = "navbtn4" class="btn"  role="button" (click) ="btncontent(3)">4</a></td>
                    <td><a id = "navbtn5" class="btn"  role="button" (click) ="btncontent(4)">5</a></td>
                </tr>
                <tr>
                    <td><a id = "navbtn6" class="btn"  role="button" (click) ="btncontent(5)">6</a></td>
                    <td><a id = "navbtn7" class="btn"  role="button" (click) ="btncontent(6)">7</a></td>
                    <td><a id = "navbtn8" class="btn"  role="button" (click) ="btncontent(7)">8</a></td>
                    <td><a id = "navbtn9" class="btn"  role="button" (click) ="btncontent(8)">9</a></td>
                    <td><a id = "navbtn10" class="btn"  role="button" (click) ="btncontent(9)">10</a></td>
                </tr>
            </table>
        </div>
        <br><br><br><br><br><br>
        <div class="text-center">
            <a class="btn btn-danger text-center" role="button" (click) = "homecnf()"><i class="bi bi-house-fill"></i> Back to Home</a>
        </div>
    </div>

    <div id="track">
        <span style="padding-right: 40px;">Answered:&nbsp;<i id = "vis" class="bi bi-square-fill"></i> </span>
        <span style="padding-right: 40px;padding-left: 40px;">Not Answered:&nbsp;<i id = "nvis" class="bi bi-square-fill"></i> </span>
        <span style="padding-right: 40px;padding-left: 40px;">Review:&nbsp;<i id = "rev" class="bi bi-square-fill"></i>  </span>
        <span style="padding-right: 40px;padding-left: 40px; ">Time Left:&nbsp;<span id="time">{{min}} Min {{timeLeft}} sec</span> </span>
    </div>

    <div class="main">
        <div id="Heading" class="media text-muted pt-3">
            <div  class="media-body pb-2 mb-0 small lh-125 border-bottom border-gray">
                <div class="d-flex justify-content-between align-items-center w-100">
                    <h6 id="qno"><strong class="text-dark"></strong></h6>
                
                </div>
            </div> 
        </div>
    
        <div class="my-3 p-3 bg-white rounded shadow-lg">
            <div class="row">
                <div class="col">
                    <div class="media text-muted pt-3">
                        <div class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
                            <div id = "quest" class="d-flex justify-content-between align-items-center w-100"></div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="w-100"></div>
            <div class="media text-muted pt-3">
                <div class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
                    <div class="d-flex justify-content-between align-items-center w-100">
                        <div class="custom-control custom-radio">
                            <input type="radio" id="op1" name="op" class="custom-control-input" >
                            <label class="custom-control-label" for="op1"><h6 id= "option1"><strong class="text-gray-dark"></strong></h6></label>
                        </div>
                    </div>
                </div>
            </div>
        
            <div class="media text-muted pt-3">
                <div class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
                    <div class="d-flex justify-content-between align-items-center w-100">
                        <div class="custom-control custom-radio">
                            <input type="radio" id="op2" name="op" class="custom-control-input" >
                            <label class="custom-control-label" for="op2"><h6 id= "option2"><strong class="text-gray-dark"></strong></h6></label>
                        </div>
                    </div> 
                </div> 
            </div>
        
            <div class="media text-muted pt-3">
                <div class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
                    <div class="d-flex justify-content-between align-items-center w-100">
                        <div class="custom-control custom-radio">
                            <input type="radio" id="op3" name="op" class="custom-control-input">
                            <label class="custom-control-label" for="op3"><h6 id= "option3"><strong class="text-gray-dark"></strong></h6></label>
                        </div>
                    </div>
                </div>
            </div>
        
        
            <div class="media text-muted pt-3">
                <div class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
                    <div class="d-flex justify-content-between align-items-center w-100">
                        <div class="custom-control custom-radio">
                            <input type="radio" id="op4" name="op" class="custom-control-input" >
                            <label class="custom-control-label" for="op4"><h6 id= "option4"><strong class="text-gray-dark"></strong></h6></label>
                        </div>
                    </div>
                </div>
            </div> 
            
        </div>
    
        <div class="text-center">
            <span style="padding-right: 40px;"><button type="button" class="btn" id = "review" (click)="review()"><i class="bi bi-eye-fill"></i> Marked for Review</button></span>
            <span style="padding-right: 40px;"><button type="button" class="btn" id= "prev" (click)="prev()"><i class="bi bi-arrow-bar-left"></i> Previous</button></span>
            <span style="padding-right: 40px;"><button type="button" class="btn" id= "next" (click)="next()">Next <i class="bi bi-arrow-bar-right"></i></button></span>
    
            <span style="padding-right: 40px;"><button type="button" class="btn btn-info" id= "savenext" (click)="savenext()"> Save & Next <i class="bi bi-arrow-bar-right"></i></button></span>
            <span *ngIf="i==9"><a id= "submitquiz" class="btn btn-success" role="button" (click)="submitquiz()">Submit Quiz</a></span>
            
        </div>
        
    </div>
    
</body>
</html>

<!DOCTYPE html>
<html>
<head>
</head>
<body >
    <div class="sidenav"></div>
    <div class="main">
        <div id="Heading" class="media text-muted pt-3">
            <div  class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
                <div class="d-flex justify-content-between align-items-center w-100">
                    <strong class="text-dark"> &nbsp;Quiz Instruction</strong>
                </div>
            </div> 
        </div>
        
        <div class="row">
            <div  class="col">
                <div class="inst">
                    <br>This quiz consists of 10 multiple-choice questions. Keep the following in mind:<br><br>
                    <ul>
                    <li><strong>Multiple Attempts -</strong> You will have <em>unlimited</em> attempts for this quiz.</li>
                    <li><strong>Timing -</strong> You will need to complete each of your attempts in one sitting, as you are allotted 15 minutes to complete each attempt.</li>
                    <li><strong>Answers -</strong> You may review your answer-choices and compare them to the correct answers after your final submission.</li>
                    </ul>
                    To start, click the <strong>"Start Quiz"</strong> button. When finished, click the <strong>"Submit Quiz"</strong> button.
                </div>
            </div>
        </div>

        <div class="my-3 p-3 bg-white rounded shadow-lg">
            <div class="row">
                <div id ="Heading" class="col">
                    <div class="media text-muted pt-3">
                        <div class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
                            <div class="d-flex justify-content-between align-items-center w-100">
                                <strong class="text-dark">Quiz Information</strong>
                            </div> 
                        </div>
                    </div>
                </div>

                <div class="w-100"></div>

                <div class="col">
                    <div class="media text-muted pt-3">
                        <div class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
                            <div class="d-flex justify-content-between align-items-center w-100">
                                <h6><strong class="text-gray-dark">Quiz Section: {{qname}}</strong></h6>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col">
                    <div class="media text-muted pt-3">
                        <div class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
                            <div class="d-flex justify-content-between align-items-center w-100">
                                <h6><strong class="text-gray-dark">Total Duration: 15 Minutes</strong></h6>
                            </div> 
                        </div>
                    </div>
                </div>

                <div class="w-100"></div>

                <div class="col">
                    <div class="media text-muted pt-3">
                        <div class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
                            <div class="d-flex justify-content-between align-items-center w-100">
                                <h6><strong class="text-gray-dark">Total Screen Question: 10</strong></h6>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col">
                    <div class="media text-muted pt-3">
                        <div class="media-body pb-3 mb-0 small lh-125 border-bottom border-gray">
                            <div class="d-flex justify-content-between align-items-center w-100">
                                <h6><strong class="text-gray-dark">Points: 100 </strong></h6>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="text-center">
            
            <span><a class="btn btn-danger" role="button" (click) = "homecnf()"><i class="bi bi-house-fill"></i> Back to Home</a></span>
            <span><a class="btn btn-success" [routerLink] = "['/quizdisplay']" role="button"><i class="bi bi-hourglass-top"></i> Start Quiz</a></span>
        </div>
    </div>
</body>
</html>

<app-navbar></app-navbar>
<div class="jumbotron">
    <h1 class="display-4"><strong>Score Card</strong></h1>
    <hr class="my-4">
    <p>See your score card on clicking below button.</p>
    <a class="btn btn-success" data-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample">
        Review & Result
    </a>
</div>

<div class="collapse" id="collapseExample">
    <div class="card card-body">
        <div style="background-color: #85C1E9 ;padding:10px;"><h3>Your Score:&nbsp;{{point}}/100</h3></div>
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Questions</th>
                    <th scope="col">Correct Answer</th>
                    <th scope="col">Your Answer</th>
                </tr>
            </thead>
            <tbody>
                <tr *ngFor = 'let item of filecontent'>
                    <th scope="row">{{item.qid}}</th>
                    <td>{{item.qtext}}</td>
                    <td>{{item.ans}}</td>
                    <td [ngClass]="{greenClass: item.col, redClass: !item.col}">{{item.uans}}</td>
                </tr>
            </tbody>
        </table>
    </div>
</div>
<app-footer></app-footer>

