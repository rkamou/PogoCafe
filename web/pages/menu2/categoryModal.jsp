<%@ page import="classes.Np" %>
<div class="modal fade" id="modal__category" tabindex="-1" role="dialog" aria-labelledby="modal__category" aria-hidden="true">
    <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Category</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <i class="ti-close font-size-14"></i>
                </button>
            </div>
            <div class="modal-body py-4">
                <form>
                    <input type="hidden" id="category-id" value="0">
                    <div class="form-group">
                        <label for="category-name" class="col-form-label">Category name</label>
                        <input type="text" class="form-control" id="category-name">
                    </div>
                    <div class="form-group">
                        <label for="category-description" class="col-form-label">Category description</label>
                        <input type="text" class="form-control" id="category-description">
                    </div>
                    <div class="form-group">
                        <label for="category-menuName" class="col-form-label">Choose menu</label>
                        <select data-placeholder="Choose menu" class="chosen-select ec-select my_select_box" tabindex="5" id="category-menuName">
                            <option value="<%= Np.Menu.breakfast%>">Breakfast</option>
                            <option value="<%= Np.Menu.lunch%>">Lunch</option>
                            <option value="<%= Np.Menu.dinner%>">Dinner</option>
                            <option value="<%= Np.Menu.kids%>">Kids</option>
                        </select>
                    </div>
                </form>
            </div>
            <div class="modal-footer py-4">
                <button type="button" class="btn btn-danger" id="category-delete">Delete</button>
                <span style="flex:auto"></span>
                <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-success" id="category-save">Save changes</button>
            </div>
        </div>
    </div>
</div>

<script>
    $(function () {
        $("#category-save").on("click", categorySave);
        $("#category-delete").on("click", categoryDelete);
    });

    function openCategoryModal(model) {
        if (model && model.id > 0) {
            $("#category-id").val(model.id);
            $("#category-name").val(model.name);
            $("#category-description").val(model.description);
            $("#category-menuName").val(model.menuName).trigger("chosen:updated");
            $("#category-delete").show();
        } else {
            $("#category-id").val(0);
            $("#category-name").val("");
            $("#category-description").val("");
            $("#category-menuName").val("breakfast").trigger("chosen:updated");
            $("#category-delete").hide();
        }
        $('#modal__category').modal('show');
    }

    function categorySave() {
        $.post("/category-edit", {
            id: $("#category-id").val(),
            name: $("#category-name").val(),
            description: $("#category-description").val(),
            menuName: $("#category-menuName").val()
        }).done(function (data) {
            if (ProceedResult(data)) {
                NotificationSuccess("Data saved successfully")
                $('#modal__category').modal('hide');
            }
        }).always(function () {
            reloadAllCategories();
        });
    }

    function categoryDelete() {
        $.post("/category-delete", {
            id: $("#category-id").val()
        }).done(function (data) {
            if (ProceedResult(data)) {
                NotificationSuccess("Category deleted successfully")
                $('#modal__category').modal('hide');
            }
        }).always(function () {
            reloadAllCategories();
        });
    }
</script>