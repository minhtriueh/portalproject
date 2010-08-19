<%-- 
    Document   : TaoHocSinh
    Created on : 18-08-2010, 20:57:02
    Author     : sanchikaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<div class="art-layout-cell art-content">
                            <div class="art-post">
                                <div class="art-post-tl"></div>
                                <div class="art-post-tr"></div>
                                <div class="art-post-bl"></div>
                                <div class="art-post-br"></div>
                                <div class="art-post-tc"></div>
                                <div class="art-post-bc"></div>
                                <div class="art-post-cl"></div>
                                <div class="art-post-cr"></div>
                                <div class="art-post-cc"></div>
                                <div class="art-post-body">
                            <div class="art-post-inner art-article">
                                            <div class="art-postmetadataheader">
                                                <h2 class="art-postheader">
                                                    <img src="images/postheadericon.png" width="26" height="26" alt="postheadericon" />
                                                    Tao hoc sinh
                                                </h2>
                                            </div>
                                            <div class="art-postcontent">
                                                <!-- article-content -->
                                                 <form id="fm-form" method="post" action="" >
                                                    <fieldset>
                                                    <legend>Personal information</legend>
                                                    <div class="fm-req">
                                                      <label for="fm-firstname">First name:</label>
                                                      <input name="fm-firstname" id="fm-firstname" type="text" />
                                                    </div>
                                                    <div class="fm-opt">

                                                      <label for="fm-middlename">Middle name:</label>
                                                      <input id="fm-middlename" name="fm-middlename" type="text" />
                                                    </div>
                                                    <div class="fm-req">
                                                      <label for="fm-lastname">Last name:</label>
                                                      <input name="fm-lastname" id="fm-lastname" type="text" />
                                                    </div>
                                                    </fieldset>

                                                    <fieldset>
                                                    <legend>Address </legend>
                                                    <div class="fm-opt">
                                                      <label for="fm-addr">Address:</label>
                                                      <input id="fm-addr" name="fm-addr" type="text" />
                                                    </div>
                                                    <div class="fm-opt">
                                                      <label for="fm-city">City or Town:</label>

                                                      <input id="fm-city" name="fm-city" type="text" />
                                                    </div>
                                                    <div class="fm-opt">
                                                      <label for="fm-state">State:</label>
                                                      <select id="fm-state" name="fm-state">
                                                        <option value="" selected="selected">Choose a State</option>
                                                        <option value="UNK">Outside US / Canada</option>

                                                        <option value="AL">Alabama</option>
                                                        <option value="AK">Alaska</option>
                                                        <option value="AB">Alberta</option>
                                                        <option value="AS">American Samoa</option>
                                                        <option value="AZ">Arizona</option>
                                                        <option value="AR">Arkansas</option>

                                                        <option value="AA">Armed Forces Americas</option>
                                                        <option value="AE">Armed Forces Europe</option>
                                                        <option value="AP">Armed Forces Pacific</option>
                                                        <option value="BC">British Columbia</option>
                                                        <option value="CA">California</option>
                                                        <option value="CO">Colorado</option>

                                                        <option value="CT">Connecticut</option>
                                                        <option value="DE">Delaware</option>
                                                        <option value="DC">District Of Columbia</option>
                                                        <option value="FL">Florida</option>
                                                        <option value="GA">Georgia</option>
                                                        <option value="GU">Guam</option>

                                                        <option value="HI">Hawaii</option>
                                                        <option value="ID">Idaho</option>
                                                        <option value="IL">Illinois</option>
                                                        <option value="IN">Indiana</option>
                                                        <option value="IA">Iowa</option>
                                                        <option value="KS">Kansas</option>

                                                        <option value="KY">Kentucky</option>
                                                        <option value="LA">Louisiana</option>
                                                        <option value="ME">Maine</option>
                                                        <option value="MB">Manitoba</option>
                                                        <option value="MD">Maryland</option>
                                                        <option value="MA">Massachusetts</option>

                                                        <option value="MI">Michigan</option>
                                                        <option value="MN">Minnesota</option>
                                                        <option value="MS">Mississippi</option>
                                                        <option value="MO">Missouri</option>
                                                        <option value="MT">Montana</option>
                                                        <option value="NE">Nebraska</option>

                                                        <option value="NV">Nevada</option>
                                                        <option value="NB">New Brunswick</option>
                                                        <option value="NH">New Hampshire</option>
                                                        <option value="NJ">New Jersey</option>
                                                        <option value="NM">New Mexico</option>
                                                        <option value="NY">New York</option>

                                                        <option value="NF">Newfoundland</option>
                                                        <option value="NC">North Carolina</option>
                                                        <option value="ND">North Dakota</option>
                                                        <option value="MP">Northern Mariana Is</option>
                                                        <option value="NT">Northwest Territories</option>
                                                        <option value="NS">Nova Scotia</option>

                                                        <option value="OH">Ohio</option>
                                                        <option value="OK">Oklahoma</option>
                                                        <option value="ON">Ontario</option>
                                                        <option value="OR">Oregon</option>
                                                        <option value="PW">Palau</option>
                                                        <option value="PA">Pennsylvania</option>

                                                        <option value="PE">Prince Edward Island</option>
                                                        <option value="PQ">Province du Quebec</option>
                                                        <option value="PR">Puerto Rico</option>
                                                        <option value="RI">Rhode Island</option>
                                                        <option value="SK">Saskatchewan</option>
                                                        <option value="SC">South Carolina</option>

                                                        <option value="SD">South Dakota</option>
                                                        <option value="TN">Tennessee</option>
                                                        <option value="TX">Texas</option>
                                                        <option value="UT">Utah</option>
                                                        <option value="VT">Vermont</option>
                                                        <option value="VI">Virgin Islands</option>

                                                        <option value="VA">Virginia</option>
                                                        <option value="WA">Washington</option>
                                                        <option value="WV">West Virginia</option>
                                                        <option value="WI">Wisconsin</option>
                                                        <option value="WY">Wyoming</option>
                                                        <option value="YT">Yukon Territory</option>

                                                      </select>
                                                    </div>
                                                    <div class="fm-req">
                                                      <label for="fm-zipcode">Zip code:</label>
                                                      <input id="fm-zipcode" name="fm-zipcode" type="text" />
                                                    </div>
                                                    </fieldset>
                                                    <fieldset>

                                                    <legend>Contact information</legend>
                                                    <div class="fm-req">
                                                      <label for="fm-telephone">Telephone:</label>
                                                      <input id="fm-telephone" name="fm-telephone" type="text" title="Enter Phone Number in xxx-xxx-xxxx format" />
                                                    </div>
                                                    <div class="fm-opt">
                                                      <label for="fm-fax">Fax:</label>

                                                      <input id="fm-fax" name="fm-fax" type="text" title="Enter Fax Number in xxx-xxx-xxxx format" />
                                                    </div>
                                                    <div class="fm-opt">
                                                      <label for="fm-mobile">Mobile:</label>
                                                      <input id="fm-mobile" name="fm-mobile" type="text" />
                                                    </div>
                                                    <div class="fm-req">
                                                      <label for="fm-email">Email:</label>

                                                      <input id="fm-email" name="fm-email" type="text" tabindex="" />
                                                    </div>
                                                    <div class="fm-opt">
                                                      <label for="fm-url">Web site address:</label>
                                                      <input id="fm-url" name="fm-url" type="text" />
                                                    </div>
                                                    <div class="fm-opt">
                                                      <label for="fm-comments">Comments:</label>

                                                      <textarea name="fm-comments" cols="10" rows="5" id="fm-comments"></textarea>
                                                    </div>
                                                    <div class="fm-multi">
                                                      <div class="fm-opt"> <p>Would you like to be notified of future updates?</p>
                                                        <label for="fm-newsopt-yes">
                                                        <input name="fm-newsopt" type="radio" id="fm-newsopt-yes" value="yes" checked="checked" />
                                                        Yes</label>

                                                        <label for="fm-newsopt-no">
                                                        <input id="fm-newsopt-no" name="fm-newsopt" type="radio" value="no" />
                                                        No</label>
                                                      </div>
                                                    </div>
                                                    </fieldset>
                                                    <div id="fm-submit" class="fm-req">
                                                      <input name="Submit" value="Submit" type="submit" />

                                                    </div>
                                                  </form>
                                               
                                                <!-- /article-content -->
                                            </div>
                                            <div class="cleared"></div>
                            </div>

                            		<div class="cleared"></div>
                                </div>
                            </div>

                        </div>
