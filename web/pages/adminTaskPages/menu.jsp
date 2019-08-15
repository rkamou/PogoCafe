<script src="/js/adminMenuFunctions.js"></script>
<div class="tab-content">
    <div class="tab-pane fade show active" id="form-basic" role="tabpanel">
        <div class="">
            <div class="container">

                <div class="row mt-5">
                    <div class="col-12 text-center my-5">
                        <h4>
                            Manage Menus
                        </h4>
                    </div>
                    <div class="col-12 mx-auto">
                        <div class="row form-group">
                            <label  class="col-2 col-form-label text-right" for="name_new_menu">Name</label>
                            <div class="col-10">
                                <input type="text" class="form-control" name="name_new_menu" id="name_new_menu">
                            </div>
                        </div>
                        <div class="row form-group">
                            <label for="description_new_menu" class="col-2 col-form-label text-right">Desciption</label>
                            <div class="col-10">
                                <textarea class="form-control" name="description_new_menu" id="description_new_menu" rows="5"></textarea>
                            </div>
                        </div>

                        <div class="form-group">
                              <button class="btn btn-primary mr-3 mb-3" id="save_new_menu">Primary</button>
                        </div>

                    </div>
<%--                    <div class="col-md-6 my-2">--%>

<%--                    </div>--%>
                </div> <!-- END row-->
                <div class="row">
                    <div class="col-12 mb-5 text-center">
                        <h4>Table - <span class="text-primary">01</span></h4>
                    </div>
                    <div class="col-lg-10 mx-auto">
                        <div class="table-responsive my-4">
                            <table class="table table-bordered" id="tab_list_menu">
                                <thead>
                                <tr>
                                    <th scope="col">Name</th>
                                    <th scope="col">Description</th>
                                    <th scope="col">Action</th>
                                </tr>
                                </thead>
                                <tbody>
                                <tr>
                                    <td>Stew</td>
                                    <td>$49</td>
                                    <td>
                                        <a href="#" class="btn btn-link">View</a>
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div> <!-- END container-->

        </div>
    </div>

</div>